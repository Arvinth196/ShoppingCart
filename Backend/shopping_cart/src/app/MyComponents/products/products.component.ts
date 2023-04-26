import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ProductService } from '../product.service';
import { Products } from './products';
import { Cart } from '../cart/cart';
import { CartserviceService } from '../cartservice.service';
// import { CreateCartRequest } from '../create-cart-request';

 
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  prodDetail : FormGroup;
  prodList: Products[]=[];
  selectedProductOrder = Products;
  productSelected: boolean = false;
  
  constructor( private router: Router,private formBuilder : FormBuilder,private prodService : ProductService, private cartitem : Cart,private cartservice: CartserviceService) { 
    
  }

  

  navigate() {
    this.router.navigate(['/cart']);
}
  ngOnInit(): void{
    this.getAllProducts();

    this.prodDetail = this.formBuilder.group({
      

      id : [''],
      description : [''],
      imageurl : [''],
      cost : [''],
      quantity : ['']

    })
  }

  addCart(product){
    this.cartservice.addToCart(product.id).subscribe()
    alert("Product Added to the Cart!");
    console.log("product added to the cart");
    
  }

    inc(prod){
      if(prod.quantity != 5){
        prod.quantity += 1;
      }
    }
  
    dec(prod){
      if(prod.quantity != 1){
        prod.quantity -= 1;
      }
    }

    getAllProducts() {
      this.prodService.getAllProduct().subscribe((res)=>{
          this.prodList = res;
      },err=>{
        console.log("error while fetching data.")
      });
    }
    
    cartItem:any;
    cartNumberFunc(){
      this.cartservice.getAllCartProds().subscribe((data=>{
        this.cartItem=data.length;
      }))
    }
    
  }


