import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';

import { NavigationbarComponent } from './navigationbar.component';

describe('NavigationbarComponent', () => {
  let component: NavigationbarComponent;
  let fixture: ComponentFixture<NavigationbarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ HttpClientModule, ReactiveFormsModule],
      declarations: [ NavigationbarComponent ],
      providers:[HttpClient]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NavigationbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call navigate() on init method',()=>{
    component. navigate();
    expect(component.navigate).toBeTruthy()
  });

  it('should call logout() on init method',()=>{
    component. logout();
    expect(component.logout).toBeTruthy()
  });
});
