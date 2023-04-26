import { HttpClient, HttpHandler } from '@angular/common/http';
import { Token } from '@angular/compiler';
import { TestBed } from '@angular/core/testing';
import { Cart } from './cart/cart';
import { Users } from './loginupdated/users';

import { UserserviceService } from './userservice.service';

describe('UserserviceService', () => {
  let service: UserserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers : [HttpClient, HttpHandler, Cart ]
    });
    service = TestBed.inject(UserserviceService);
    
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('loginMember', () => {
    service.loginMember(UserserviceService.arguments);
    expect(service).toBeTruthy();
  });
  it('ValidateToken', () => {
    service.validateToken("asdasdasd");
    expect(service).toBeTruthy();
  });
});
