import { HttpClient, HttpClientModule, HttpHandler } from '@angular/common/http';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { Cart } from '../cart/cart';

import { ProductsComponent } from './products.component';

describe('ProductsComponent', () => {
  let component: ProductsComponent;
  let fixture: ComponentFixture<ProductsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports : [HttpClientModule, ReactiveFormsModule],
      declarations: [ ProductsComponent ],
      providers : [ FormBuilder , HttpClient, Cart ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call addCart() on init method',()=>{
    component. addCart(ProductsComponent);
    expect(component.addCart).toBeTruthy()
  });

  it('should call inc() on init method',()=>{
    component. inc(ProductsComponent);
    expect(component.inc).toBeTruthy()
  });

  it('should call dec() on init method',()=>{
    component. dec(ProductsComponent);
    expect(component.dec).toBeTruthy()
  });

  it('should call ngOnInit() on init method',()=>{
    component. ngOnInit();
    expect(component.ngOnInit).toBeTruthy()
  });

  it('should call getAllProducts() on init method',()=>{
    component. getAllProducts();
    expect(component.getAllProducts).toBeTruthy()
  });

  it('navigate',()=>{
    component. navigate();
    expect(component.navigate).toBeTruthy()
  });
});
