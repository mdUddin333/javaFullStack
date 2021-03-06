import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowOrHideComponent } from './show-or-hide.component';

describe('ShowOrHideComponent', () => {
  let component: ShowOrHideComponent;
  let fixture: ComponentFixture<ShowOrHideComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowOrHideComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowOrHideComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
