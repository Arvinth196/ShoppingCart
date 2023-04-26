import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { CartserviceService } from '../cartservice.service';
import { Cart } from './cart';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  
  sub: Subscription;
  selectedProductOrder: Cart;
  cartitem: any;


  constructor(private router: Router, private Cartservice:CartserviceService) {        
  }

  ngOnInit(): void {
    this.cartDetails();
  }

  navigate() {
    this.router.navigate(['/products']);
  }
  
  onCheckout(){
    
    this.getCartDetails.forEach((item:any)=>{
      this.Cartservice.Checkout(item).subscribe()
    })
    
    window.alert("Checkedout Successfull")
    window.location.reload()

  }

  getCartDetails:any=[];
  cartDetails(){
    this.Cartservice.getAllCartProds().subscribe((data=>{

      this.getCartDetails=data;
    }))
  }

  incQnt(prod:any){
    if(prod.quantity!=5){
      prod.quantity=prod.quantity+1;
      this.Cartservice.Update(prod).subscribe()
    }
    
    }
    
  decQnt(prod:any){
    if(prod.quantity>0){
      prod.quantity=prod.quantity-1;
      this.Cartservice.Update(prod).subscribe()
    }
    
    }
  
  singleDelete(getCartDetails){
    console.log(getCartDetails);
    this.Cartservice.Delete(getCartDetails).subscribe()
    this.cartDetails();
    
    // location.reload();
    

  }    

  }
