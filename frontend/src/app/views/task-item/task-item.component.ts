import { Component, Input } from '@angular/core';
import { Task } from 'src/app/models/task';
import { faTimes } from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css'],
})
export class TaskItemComponent {
  @Input() task: Task | undefined;
  faTimes = faTimes;
}
