import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { url } from 'src/environments/environment';
import { Cart } from './cart/cart';
import { ProductService } from './product.service';
import { Products } from './products/products';
// import { CreateCartRequest } from './create-cart-request';

@Injectable({
  providedIn: 'root'
})
export class CartserviceService {
  
  

  constructor(private http:HttpClient) {

   }
   
   private userId:number = Number(localStorage.getItem("token"));
   getAllCartProds():Observable<any>{
    let token:string = String(localStorage.getItem("token"));
        const headers = new HttpHeaders().set("Authorization",'Bearer ' + token);
    return this.http.get(`${url}/PRODUCT-CART-SERVICE/cartitem/cart/${Number(localStorage.getItem("userId"))}`,{'headers': headers});



  }

  addToCart(id:any):Observable<any>{
    let token:string = String(localStorage.getItem("token"));
        const headers = new HttpHeaders().set("Authorization",'Bearer ' + token);
    return this.http.post(`${url}/PRODUCT-CART-SERVICE/products/products/addToCart/${Number(localStorage.getItem("userId"))}`,id,{'headers': headers});

  }

  Update(id:any):Observable<any>{
    let token: String = String(localStorage.getItem('token'));
        const headers = new HttpHeaders().set("Authorization",'Bearer '+token);
    return this.http.put(`${url}/PRODUCT-CART-SERVICE/cartitem/cartupdate/${Number(localStorage.getItem("userId"))}`,id,{'headers': headers});
  }

  Delete(id:any):Observable<any>{
    let token: String = String(localStorage.getItem('token'));
        const headers = new HttpHeaders().set("Authorization",'Bearer '+token);
    return this.http.delete(`${url}/PRODUCT-CART-SERVICE/cartitem/cart/${id}/${Number(localStorage.getItem("userId"))}`,{'headers': headers});

}
  
  
  Checkout(item:any):Observable<any>{
    let token: String = String(localStorage.getItem('token'));
        const headers = new HttpHeaders().set("Authorization",'Bearer '+token);
    return this.http.post(`${url}/PRODUCT-CART-SERVICE/cartitem/cart/checkout/${Number(localStorage.getItem("userId"))}`,item,{'headers': headers});



}

}
