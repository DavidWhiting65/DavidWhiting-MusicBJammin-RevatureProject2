import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MusicianhomepageComponent } from './musicianhomepage.component';

describe('MusicianhomepageComponent', () => {
  let component: MusicianhomepageComponent;
  let fixture: ComponentFixture<MusicianhomepageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MusicianhomepageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MusicianhomepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
