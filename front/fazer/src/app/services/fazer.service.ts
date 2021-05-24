import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Fazer } from '../models/fazer';

@Injectable({
  providedIn: 'root'
})
export class FazerService {


  baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) { }

 findAll(): Observable<Fazer[]>{
   return this.http.get<Fazer[]>(this.baseUrl);
 }
}
