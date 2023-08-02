import { Component, Directive, ElementRef } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-transfer-money',
  // templateUrl: './transfer-money.component.html',
  template: `
            <h4>{{message}}</h4>
        `,
  styleUrls: ['./transfer-money.component.css'],

})
export class TransferMoneyComponent {

  message:string = "Hello world";
  constructor(el:ElementRef) {
    el.nativeElement.style.backgroundColor = "blue";

   }

  data = "This is an example component of two way data binding.";


  ngOnInit() {
  }

}
