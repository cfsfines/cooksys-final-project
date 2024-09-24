import { Component } from '@angular/core';
import {MatButton} from "@angular/material/button";
import {RouterOutlet} from "@angular/router";

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  imports: [
    MatButton,
    RouterOutlet,
  ],
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'client';
}
