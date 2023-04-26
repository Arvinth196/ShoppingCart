import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-navigationbar',
  templateUrl: './navigationbar.component.html',
  styleUrls: ['./navigationbar.component.css']
})
export class NavigationbarComponent implements OnInit {

  constructor(private router: Router,public serve:AuthService) {        
  }

  ngOnInit(): void {
  }

  navigate() {
    this.router.navigate(['/login']);
  }

  logout() {
    localStorage.removeItem("token");

    console.log('removed')
    this.router.navigate(['/login']);
  }

}
