package br.cnec.fcsl.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

import br.cnec.fcsl.entidade.ElementoQuimico;
import br.cnec.fcsl.entidade.Familia;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Frame extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JLabel lblFamilia;
	private JLabel lblElemneto;
	private JComboBox comboFamilia;
	private JComboBox comboElemento;
	private JPanel panel;
	private JLabel lblSmbolo;
	private JLabel lblNome;
	private JLabel lblNmero;
	private JLabel lblMassa;
	private JLabel lblFamlia;
	private JLabel labelSimbolo;
	private JLabel labelNome;
	private JLabel labelNumero;
	private JLabel labelMassa;
	private JLabel labelFamilia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblFamilia = new JLabel("Familia:");
		
		lblElemneto = new JLabel("Elemento:");
		
		comboFamilia = new JComboBox();
		comboFamilia.addItemListener(this);
		comboFamilia.setModel(new DefaultComboBoxModel(Familia.values()));
		
		comboElemento = new JComboBox();
		comboElemento.addItemListener(this);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es do elemento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFamilia)
						.addComponent(lblElemneto))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboFamilia, 0, 356, Short.MAX_VALUE)
						.addComponent(comboElemento, 0, 356, Short.MAX_VALUE))
					.addContainerGap())
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboFamilia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFamilia))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboElemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblElemneto))
					.addGap(33)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
		);
		
		lblSmbolo = new JLabel("S\u00EDmbolo:");
		
		lblNome = new JLabel("Nome:");
		
		lblNmero = new JLabel("N\u00FAmero:");
		
		lblMassa = new JLabel("Massa:");
		
		lblFamlia = new JLabel("Fam\u00EDlia:");
		
		labelSimbolo = new JLabel("-");
		
		labelNome = new JLabel("-");
		
		labelNumero = new JLabel("-");
		
		labelMassa = new JLabel("-");
		
		labelFamilia = new JLabel("-");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSmbolo)
						.addComponent(lblNome)
						.addComponent(lblNmero)
						.addComponent(lblMassa)
						.addComponent(lblFamlia))
					.addGap(52)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(labelSimbolo, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
						.addComponent(labelNome, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
						.addComponent(labelNumero, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
						.addComponent(labelMassa, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
						.addComponent(labelFamilia, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSmbolo)
						.addComponent(labelSimbolo))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(labelNome))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmero)
						.addComponent(labelNumero))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMassa)
						.addComponent(labelMassa))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFamlia)
						.addComponent(labelFamilia))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == comboElemento) {
			do_comboElemento_itemStateChanged(arg0);
		}
		if (arg0.getSource() == comboFamilia) {
			do_comboBox_itemStateChanged(arg0);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent arg0) {
		Familia familiaSelecionada = (Familia)comboFamilia.getSelectedItem();
		
		comboElemento.removeAllItems();
		for(ElementoQuimico e: ElementoQuimico.values()){
			if(e.getFamilia().equals(familiaSelecionada)){
				comboElemento.addItem(e);
			}
		}
	}
	protected void do_comboElemento_itemStateChanged(ItemEvent arg0) {
		ElementoQuimico elementoSelecionado = (ElementoQuimico)comboElemento.getSelectedItem();
		
		if(elementoSelecionado == null){
			labelFamilia.setText("-");
			labelMassa.setText("-");
			labelNome.setText("-");
			labelNumero.setText("-");
			labelSimbolo.setText("-");			
		} else {
			labelFamilia.setText(elementoSelecionado.getFamilia().toString());
			labelMassa.setText(elementoSelecionado.getMassa().toString());
			labelNome.setText(elementoSelecionado.getNome());
			labelNumero.setText(elementoSelecionado.getNumero().toString());
			labelSimbolo.setText(elementoSelecionado.getSimbolo());	
		}
		
	}
}
