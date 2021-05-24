import { Component, OnInit } from '@angular/core';
import { Fazer } from 'src/app/models/fazer';
import { FazerService } from 'src/app/services/fazer.service';

@Component({
  selector: 'app-read-all',
  templateUrl: './read-all.component.html',
  styleUrls: ['./read-all.component.css']
})
export class ReadAllComponent implements OnInit {

  list: Fazer[] = [];

  constructor(private service: FazerService) { }

  ngOnInit(): void {
    this.findAll();
  }

  findAll(): void{
    this.service.findAll().subscribe((resposta)=>{
      this.list = resposta;
    })
  }



}
