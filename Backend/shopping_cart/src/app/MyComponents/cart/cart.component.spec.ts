import { HttpClient, HttpClientModule, HttpHandler } from '@angular/common/http';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';

import { CartComponent } from './cart.component';

describe('CartComponent', () => {
  let component: CartComponent;
  let fixture: ComponentFixture<CartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientModule, ReactiveFormsModule],
      declarations: [ CartComponent ],
      providers: [ HttpClient ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call CartDetails() on init method',()=>{
    spyOn(component,'cartDetails').and.callThrough();
    component.ngOnInit();
    expect(component.cartDetails).toHaveBeenCalled()
  });

  it('should onCheckout() in cartDetails()',()=>{
    component. onCheckout();
    expect(component.onCheckout).toBeTruthy()
  })
  
  it('should call navigate() on init method',()=>{
    component. navigate();
    expect(component.navigate).toBeTruthy()
  });
  
  it('should call singleDelete() on init method',()=>{
    component. singleDelete(CartComponent);
    expect(component.singleDelete).toBeTruthy()
  });

  it('should call incQnt() on init method',()=>{
    component. incQnt(3);
    expect(component.incQnt).toBeTruthy()
  });

  it('should call incQnt() on init method',()=>{
    component. incQnt(4);
    expect(component.incQnt).toBeTruthy()
  });

  it('should call decQnt() on init method',()=>{
    component. decQnt(2);
    expect(component.decQnt).toBeTruthy()
  });
  it('should call decQnt() on init method',()=>{
    component. decQnt(1);
    expect(component.decQnt).toBeTruthy()
  });

});
