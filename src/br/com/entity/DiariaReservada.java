package br.com.entity;

import br.com.entity.Diaria;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity
public class DiariaReservada extends Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_reserva")
	private Reserva reserva;

	public DiariaReservada() {
		super();
	}

	public Reserva getReservar() {
		return reserva;
	}

	public void setReservar(Reserva reserva) {
		this.reserva = reserva;
	}
}
