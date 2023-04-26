import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './MyComponents/auth-guard';
import { CartComponent } from './MyComponents/cart/cart.component';
import { LoginupdatedComponent } from './MyComponents/loginupdated/loginupdated.component';
import { ProductsComponent } from './MyComponents/products/products.component';

const routes: Routes = [
  { path:'', pathMatch:'full', redirectTo:'login' },
  {path:'login', component:LoginupdatedComponent},
  {path:'products', component:ProductsComponent},
  {path:'cart', component:CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
