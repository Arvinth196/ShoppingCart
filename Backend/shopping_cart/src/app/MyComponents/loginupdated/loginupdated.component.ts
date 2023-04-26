import { Component, OnInit, resolveForwardRef } from '@angular/core';
import { FormsModule,FormBuilder, FormGroup, Validators, NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { removeSpaces } from 'src/app/app.module';
import { UserserviceService } from '../userservice.service';
import { Cart } from '../cart/cart';
import { Users } from './users';
import { AuthenticationResponse } from '../authentication-response';
import { UserDetails } from '../user-details';
import { AuthService } from '../auth.service';


@Component({
  selector: 'app-loginupdated',
  templateUrl: './loginupdated.component.html',
  styleUrls: ['./loginupdated.component.css']
})
export class LoginupdatedComponent implements OnInit {
  
  token!: string;
  errMsg!: string;
  user : Users={
    // 'userid':" ",
    'upassword':" ",
    'uname':" "
  };

  userDtls!: UserDetails
   //authResponse : any;
  authResponse:AuthenticationResponse ={
    'userid':"",
    'name':"",
    'valid':false
  };

  lnform!: FormGroup
  submitted:false;
  getData: boolean;
  console: any;
  static user: any;
  
  constructor(private formBuilder: FormBuilder, private router: Router,private authService: AuthService,private userservice :UserserviceService) { }

  ngOnInit() {
  }

  onLogin(custForm:NgForm)
  {
    console.log(custForm.value.username);
    console.log(custForm.value.password);
    this.user.uname=custForm.value.username;
    this.user.upassword=custForm.value.password;
    this.user.uname=custForm.value.username;
    this.userservice.loginMember(this.user).subscribe( data => {error :
      this.errMsg='';
      console.log(data);

      this.userDtls= data as UserDetails;
      localStorage.setItem("userId", this.userDtls.userid);
      localStorage.setItem("token", this.userDtls.authToken);
      console.log(this.userDtls.authToken);
      let response=this.userservice.validateToken(this.userDtls.authToken);
      response.subscribe(data1=>{
        console.log(data1);
        this.authResponse=data1 as AuthenticationResponse;
        console.log(this.authResponse.name, this.authResponse.valid);
        if(this.authResponse.valid){
          console.log("true valid");
          this.authService.login()
          alert("success");

        }
        else{
          
          console.log("false valid");
          this.authService.logout();
          
        }
        if(this.authService.isLoggedIn()){
          localStorage.setItem('name',this.authResponse.name);
          this.router.navigate(['products']);
        }

      });
      
    }, error=>{
        alert("Invalid Details"); 
        this.errMsg = "Invalid Credentials!"
    })
    custForm.reset();
  }
}
