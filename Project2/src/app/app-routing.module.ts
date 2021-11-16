import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { EmployeehomepageComponent } from './employeehomepage/employeehomepage.component';
import { MusicianhomepageComponent } from './musicianhomepage/musicianhomepage.component';
import { UserhomepageComponent } from './userhomepage/userhomepage.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path: 'register', component: RegisterComponent},
  //{path: 'login', component: LoginComponent},
  {path: 'login', component: UserComponent},
  {path: 'employeehomepage', component: EmployeehomepageComponent},
  {path: 'musicianhomepage', component: MusicianhomepageComponent},
  {path: 'userhomepage', component: UserhomepageComponent},
  {path: '', redirectTo: '/login', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
