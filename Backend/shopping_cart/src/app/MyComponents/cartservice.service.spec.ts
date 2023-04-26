import { HttpClient, HttpHandler } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';

import { CartserviceService } from './cartservice.service';

describe('CartserviceService', () => {
  let service: CartserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ HttpClient, HttpHandler]
    });
    service = TestBed.inject(CartserviceService);
    
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('update', () => {
    service.Update(1);
    expect(service).toBeTruthy();
  });
  it('checkout', () => {
    service.Checkout(1);
    expect(service).toBeTruthy();
  });
});
