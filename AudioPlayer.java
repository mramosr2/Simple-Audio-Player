{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-BoldItalic;\f2\fnil\fcharset0 Menlo-Italic;
}
{\colortbl;\red255\green255\blue255;\red204\green108\blue29;\red217\green232\blue247;\red230\green230\blue250;
\red18\green144\blue195;\red249\green250\blue244;\red30\green181\blue64;\red121\green171\blue255;\red242\green242\blue0;
\red167\green236\blue33;\red141\green218\blue248;\red23\green198\blue163;\red150\green236\blue63;\red243\green236\blue121;
\red128\green242\blue246;\red128\green246\blue167;\red104\green151\blue187;}
{\*\expandedcolortbl;;\csgenericrgb\c80000\c42353\c11373;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c90196\c90196\c98039;
\csgenericrgb\c7059\c56471\c76471;\csgenericrgb\c97647\c98039\c95686;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c47451\c67059\c100000;\csgenericrgb\c94902\c94902\c0;
\csgenericrgb\c65490\c92549\c12941;\csgenericrgb\c55294\c85490\c97255;\csgenericrgb\c9020\c77647\c63922;\csgenericrgb\c58824\c92549\c24706;\csgenericrgb\c95294\c92549\c47451;
\csgenericrgb\c50196\c94902\c96471;\csgenericrgb\c50196\c96471\c65490;\csgenericrgb\c40784\c59216\c73333;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 File\cf4 ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 IOException\cf4 ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 util\cf4 .\cf3 Scanner\cf4 ;\cf0 \
\
\cf2 import\cf3  javax\cf4 .\cf3 sound\cf4 .\cf3 sampled\cf4 .\cf3 AudioInputStream\cf4 ;\cf0 \
\cf2 import\cf3  javax\cf4 .\cf3 sound\cf4 .\cf3 sampled\cf4 .\cf3 AudioSystem\cf4 ;\cf0 \
\cf2 import\cf3  javax\cf4 .\cf3 sound\cf4 .\cf3 sampled\cf4 .\cf3 Clip\cf4 ;\cf0 \
\cf2 import\cf3  javax\cf4 .\cf3 sound\cf4 .\cf3 sampled\cf4 .\cf3 LineUnavailableException\cf4 ;\cf0 \
\cf2 import\cf3  javax\cf4 .\cf3 sound\cf4 .\cf3 sampled\cf4 .\cf3 UnsupportedAudioFileException\cf4 ;\cf0 \
\
\cf2 public\cf3  \cf2 class\cf3  \cf5 AudioPlayer\cf3  \cf6 \{\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf3 	\cf2 public\cf3  \cf2 static\cf3  \cf2 void\cf3  \cf7 main\cf6 (\cf5 String\cf6 []\cf3  \cf8 args\cf6 )\cf3  \cf2 throws\cf3  \cf5 UnsupportedAudioFileException\cf4 ,\cf3  \cf5 IOException\cf4 ,\cf3  \cf5 LineUnavailableException\cf3  \cf6 \{\cf0 \
\cf3 	\cf5 Scanner\cf3  \cf9 \ul \ulc9 scanner\cf3 \ulnone  \cf4 =\cf3  \cf2 new\cf3  \cf10 Scanner\cf6 (\cf5 System\cf4 .
\f1\i\b \cf11 in
\f0\i0\b0 \cf6 )\cf4 ;\cf0 \
\cf3 		\cf5 File\cf3  \cf9 f\cf3  \cf4 =\cf3  \cf2 new\cf3  \cf10 File\cf6 (\cf12 "YourFile.wav"\cf6 )\cf4 ;\cf0 \
\cf3 		\cf5 AudioInputStream\cf3  \cf9 as\cf3  \cf4 =\cf3  \cf5 AudioSystem\cf4 .
\f2\i \cf13 getAudioInputStream
\f0\i0 \cf6 (\cf14 f\cf6 )\cf4 ;\cf0 \
\cf3 		\cf15 Clip\cf3  \cf9 c\cf3  \cf4 =\cf3  \cf5 AudioSystem\cf4 .
\f2\i \cf13 getClip
\f0\i0 \cf6 ()\cf4 ;\cf0 \
\cf3 		\cf14 c\cf4 .\cf16 open\cf6 (\cf14 as\cf6 )\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf5 String\cf3  \cf9 r\cf3  \cf4 =\cf3  \cf12 " "\cf4 ;\cf0 \
\cf3 		\cf14 r\cf3  \cf4 =\cf3  \cf14 r\cf4 .\cf10 toUpperCase\cf6 ()\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 while\cf6 (\cf4 !\cf14 r\cf4 .\cf10 equals\cf6 (\cf12 "Q"\cf6 ))\cf3  \cf6 \{\cf0 \
\cf3 			\cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf10 println\cf6 (\cf12 "P = Play, S = Stop, R = Reset, Q = Quit"\cf6 )\cf4 ;\cf0 \
\cf3 			\cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf10 println\cf6 (\cf12 "Enter a Character: "\cf6 )\cf4 ;\cf0 \
\cf3 			\cf0 \
\cf3 			\cf14 r\cf3  \cf4 =\cf3  \cf14 scanner\cf4 .\cf10 next\cf6 ()\cf4 ;\cf0 \
\cf3 			\cf14 r\cf3  \cf4 =\cf3  \cf14 r\cf4 .\cf10 toUpperCase\cf6 ()\cf4 ;\cf0 \
\cf3 			\cf0 \
\cf3 			\cf2 switch\cf6 (\cf14 r\cf6 )\cf3  \cf6 \{\cf0 \
\cf3 			\cf2 case\cf3  \cf6 (\cf12 "P"\cf6 )\cf4 :\cf3  \cf14 c\cf4 .\cf16 start\cf6 ()\cf4 ;\cf0 \
\cf3 			\cf2 break\cf4 ;\cf0 \
\cf3 			\cf2 case\cf3  \cf6 (\cf12 "S"\cf6 )\cf4 :\cf3  \cf14 c\cf4 .\cf16 stop\cf6 ()\cf4 ;\cf0 \
\cf3 			\cf2 break\cf4 ;\cf3  \cf0 \
\cf3 			\cf2 case\cf3  \cf6 (\cf12 "R"\cf6 )\cf4 :\cf3  \cf14 c\cf4 .\cf16 setMicrosecondPosition\cf6 (\cf17 0\cf6 )\cf4 ;\cf0 \
\cf3 			\cf2 break\cf4 ;\cf0 \
\cf3 			\cf2 default\cf4 :\cf3  \cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf10 println\cf6 (\cf12 "Not a valid Response Lil Bro Do it Again: "\cf6 )\cf4 ;\cf0 \
\cf3 			\cf0 \
\cf3 			\cf6 \}\cf0 \
\cf3 		\cf6 \}\cf0 \
\cf3 		\cf6 \}\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf6 \}\cf0 \
}