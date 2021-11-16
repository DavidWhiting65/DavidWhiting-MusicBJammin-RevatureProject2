import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { EmployeehomepageComponent } from './employeehomepage/employeehomepage.component';
import { MusicianhomepageComponent } from './musicianhomepage/musicianhomepage.component';
import { UserhomepageComponent } from './userhomepage/userhomepage.component';
import { SongComponent } from './song/song.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { SongService } from './services/song.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from  '@angular/common/http';
import { UserComponent } from './user/user.component';

import { ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatChipsModule } from '@angular/material/chips';
import { MatRadioModule } from '@angular/material/radio';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    EmployeehomepageComponent,
    MusicianhomepageComponent,
    UserhomepageComponent,
    SongComponent,
    CatalogueComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MatInputModule,
    MatSelectModule,
    MatButtonModule,
    MatCheckboxModule,
    MatChipsModule,
    MatRadioModule
  ],
  providers: [
    SongService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
