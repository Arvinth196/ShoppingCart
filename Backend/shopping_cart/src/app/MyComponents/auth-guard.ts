import { ActivatedRouteSnapshot, Router, RouterStateSnapshot, UrlTree } from "@angular/router";
import { Observable } from "rxjs";
import { AuthService } from "./auth.service";

export class AuthGuard {
    canActivate(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
        if(this.service.isLoggedIn()){
          return true;
        }else{
          this.router.navigate(['/']);
        }
        return false;
      }
      constructor(private router: Router, private service :AuthService){
    
      
    }
}
