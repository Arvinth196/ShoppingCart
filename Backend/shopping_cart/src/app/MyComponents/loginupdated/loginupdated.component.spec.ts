import { NgClass } from '@angular/common';
import { HttpClient, HttpClientModule, HttpHandler } from '@angular/common/http';
import { DebugElement } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormBuilder, NgForm, ReactiveFormsModule, } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationResponse } from '../authentication-response';


import { LoginupdatedComponent } from './loginupdated.component';
import { Users } from './users';

describe('LoginupdatedComponent', () => {let component: LoginupdatedComponent;
  let fixture: ComponentFixture<LoginupdatedComponent>;
  
  beforeEach(async () => {await TestBed.configureTestingModule({
    imports:[ ReactiveFormsModule,HttpClientModule],
    providers:[{provide:LoginupdatedComponent,useValue:LoginupdatedComponent},FormBuilder,{provide:Router,useValue:Router}, HttpClient, HttpHandler],
    declarations: [ LoginupdatedComponent ]
  }).compileComponents();

    fixture = TestBed.createComponent(LoginupdatedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component successfully created', () => {
    expect(component).toBeTruthy()
  });

  it('should call ngOnIniT() on init method',()=>{
    component.ngOnInit();
    expect(component.ngOnInit).toBeTruthy()
  }); 

  it('should call onLogin() on init method',()=>{
    component. onLogin(Users.arguments);
    expect(component.onLogin).toEqual(true)
  });

  it('users',()=>{
    expect(component.user).toBeTruthy()
  });

  it('error',()=>{
    component.errMsg;
    expect(component.errMsg).toBeFalsy()
  });    
});



