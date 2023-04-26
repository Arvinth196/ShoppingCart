import { NgModule, OnInit } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginupdatedComponent } from './MyComponents/loginupdated/loginupdated.component';
import { NavigationbarComponent } from './MyComponents/navigationbar/navigationbar.component';
import { RouterModule } from '@angular/router';
import { CartComponent } from './MyComponents/cart/cart.component';
import { AbstractControl } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { ProductsComponent } from './MyComponents/products/products.component';
import { Cart } from './MyComponents/cart/cart';
// import { CreateCartRequest } from './MyComponents/create-cart-request';

@NgModule({
  declarations: [
    AppComponent,
    LoginupdatedComponent,
    LoginupdatedComponent,
    NavigationbarComponent,
    CartComponent,
    ProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    RouterModule,
    HttpClientModule,
    FormsModule,
    
  ],
  providers: [Cart],
  bootstrap: [AppComponent]
})
export class AppModule  {
  
  
 }

export function removeSpaces(control: AbstractControl) {
  if (control && control.value && !control.value.replace(/\s/g, '').length) {
    control.setValue('');
  }
  return null;
}
