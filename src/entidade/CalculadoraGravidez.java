package entidade;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}

	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}

	public Date calcularDataEstimadaConcepcao() {

		Calendar c1 = this.converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		c1.add(Calendar.WEEK_OF_YEAR, 2);
		return c1.getTime();

		// implementar cálculo de data estimada da concepção
		// 2 semanas após a data do último período menstrual
	}

	public Date calcularDataEstimadaParto() {

		Calendar c2 = this.converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		c2.add(Calendar.WEEK_OF_YEAR, 40);
		return c2.getTime();
		// implementar cálculo de data estimada para parto
		// 40 semanas após a data do último período menstrual
	}

}