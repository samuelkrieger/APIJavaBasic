import { Component, OnInit } from '@angular/core';
import { Fazer } from 'src/app/models/fazer';

@Component({
  selector: 'app-read-all',
  templateUrl: './read-all.component.html',
  styleUrls: ['./read-all.component.css']
})
export class ReadAllComponent implements OnInit {

  list: Fazer[] = [
    {
      titulo: "Teste 1",
      dataParaFinalizar: new Date,
      finalizado: false
    },
    {
      titulo: "Teste 2",
      dataParaFinalizar: new Date,
      finalizado: false
    },
    {
      titulo: "Jeff",
      dataParaFinalizar: new Date,
      finalizado: false
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
