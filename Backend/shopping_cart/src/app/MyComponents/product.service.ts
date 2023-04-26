import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { url } from 'src/environments/environment';
import { Products } from './products/products';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  getProdUrl : string;
  SelectedProductOrder: any;

  constructor(private http:HttpClient) {
  }

  getAllProduct():Observable<Products[]>{
    let token: String = String(localStorage.getItem('token'));
        const headers = new HttpHeaders().set("Authorization",'Bearer '+token);
    return this.http.get<Products[]>(`${url}/PRODUCT-CART-SERVICE/products/getAll`,{'headers': headers});
  }
}
