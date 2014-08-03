/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MODEL;

/**
 *
 * @author rafael casagrande...
 */
public class Automovel {
    
    private int automovelCodigo;
    private String automovelTag;
    private String automovelStatus;
    private String automovelRegistro;
    private String automovelPlaca;
    private String automovelCor;
    private int automovelAno;
    private int modeloCodigo;

    public Automovel(int automovelCodigo, String automovelTag, String automovelStatus, String automovelRegistro, String automovelPlaca, String automovelCor, int automovelAno, int modeloCodigo) {
        this.automovelCodigo = automovelCodigo;
        this.automovelTag = automovelTag;
        this.automovelStatus = automovelStatus;
        this.automovelRegistro = automovelRegistro;
        this.automovelPlaca = automovelPlaca;
        this.automovelCor = automovelCor;
        this.automovelAno = automovelAno;
        this.modeloCodigo = modeloCodigo;
    }


    public int getAutomovelCodigo() {
        return automovelCodigo;
    }

    public void setAutomovelCodigo(int automovelCodigo) {
        this.automovelCodigo = automovelCodigo;
    }

    public String getAutomovelTag() {
        return automovelTag;
    }

    public void setAutomovelTag(String automovelTag) {
        this.automovelTag = automovelTag;
    }

    public String getAutomovelStatus() {
        return automovelStatus;
    }

    public void setAutomovelStatus(String automovelStatus) {
        this.automovelStatus = automovelStatus;
    }

    public String getAutomovelRegistro() {
        return automovelRegistro;
    }

    public void setAutomovelRegistro(String automovelRegistro) {
        this.automovelRegistro = automovelRegistro;
    }

    public String getAutomovelPlaca() {
        return automovelPlaca;
    }

    public void setAutomovelPlaca(String automovelPlaca) {
        this.automovelPlaca = automovelPlaca;
    }

    public String getAutomovelCor() {
        return automovelCor;
    }

    public void setAutomovelCor(String automovelCor) {
        this.automovelCor = automovelCor;
    }

    public int getAutomovelAno() {
        return automovelAno;
    }

    public void setAutomovelAno(int automovelAno) {
        this.automovelAno = automovelAno;
    }

    public int getModeloCodigo() {
        return modeloCodigo;
    }

    public void setModeloCodigo(int modeloCodigo) {
        this.modeloCodigo = modeloCodigo;
    }

    
}
