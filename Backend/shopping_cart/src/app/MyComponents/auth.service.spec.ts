import { TestBed } from '@angular/core/testing';

import { AuthService } from './auth.service';

describe('AuthService', () => {
  let service: AuthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('login', () => {
    service.login();
    expect(service).toBeTruthy();
  });

  it('logout', () => {
    service.logout();
    expect(service).toBeTruthy();
  });
});
