import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css'],
})
export class ButtonComponent {
  onClick() {
    this.btnClick.emit();
    console.log('Button clicked');
  }
  @Input() text!: string;
  @Input() color!: string;
  @Output() btnClick = new EventEmitter();
}
