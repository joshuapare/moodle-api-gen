# ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bordercolor** | Pointer to **string** | Border color | [optional] [default to "null"]
**Borderstyle** | Pointer to **string** | Border style | [optional] [default to "null"]
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Customtext** | Pointer to **string** | Custom text | [optional] [default to "null"]
**Datefmt** | Pointer to **int32** | Date format | [optional] [default to null]
**Delivery** | Pointer to **int32** | Delivery options | [optional] [default to null]
**Emailothers** | Pointer to **string** | Email others? | [optional] [default to "null"]
**Emailteachers** | Pointer to **int32** | Email teachers? | [optional] [default to null]
**Gradefmt** | Pointer to **int32** | Grade format | [optional] [default to null]
**Groupingid** | Pointer to **int32** | group id | [optional] 
**Groupmode** | Pointer to **int32** | group mode | [optional] [default to null]
**Id** | Pointer to **int32** | Certificate id | [optional] [default to null]
**Intro** | Pointer to **string** | The Certificate intro | [optional] [default to "null"]
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Iomadcertificatetype** | Pointer to **string** | Type | [optional] [default to "null"]
**Name** | Pointer to **string** | Certificate name | [optional] [default to "null"]
**Orientation** | Pointer to **string** | Orientation | [optional] [default to "null"]
**Printdate** | Pointer to **string** | Print date? | [optional] [default to "null"]
**Printgrade** | Pointer to **int32** | Print grade? | [optional] [default to null]
**Printhours** | Pointer to **string** | Print hours? | [optional] [default to "null"]
**Printnumber** | Pointer to **int32** | Print number? | [optional] [default to null]
**Printoutcome** | Pointer to **int32** | Print outcome? | [optional] [default to null]
**Printseal** | Pointer to **string** | Print seal? | [optional] [default to "null"]
**Printsignature** | Pointer to **string** | Print signature? | [optional] [default to "null"]
**Printteacher** | Pointer to **int32** | Print teacher? | [optional] [default to null]
**Printwmark** | Pointer to **string** | Print water mark? | [optional] [default to "null"]
**Reportcert** | Pointer to **int32** | Report iomadcertificate? | [optional] [default to null]
**Requiredtime** | Pointer to **int32** | Required time | [optional] [default to null]
**Requiredtimenotmet** | Pointer to **int32** | Whether the time req is met | [optional] [default to null]
**Savecert** | Pointer to **int32** | Save iomadcertificate? | [optional] [default to null]
**Section** | Pointer to **int32** | course section id | [optional] 
**Timecreated** | Pointer to **int32** | Time created | [optional] 
**Timemodified** | Pointer to **int32** | Time modified | [optional] 
**Visible** | Pointer to **int32** | visible | [optional] 

## Methods

### NewModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner

`func NewModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner() *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner`

NewModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner instantiates a new ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInnerWithDefaults

`func NewModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInnerWithDefaults() *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner`

NewModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInnerWithDefaults instantiates a new ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBordercolor

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetBordercolor() string`

GetBordercolor returns the Bordercolor field if non-nil, zero value otherwise.

### GetBordercolorOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetBordercolorOk() (*string, bool)`

GetBordercolorOk returns a tuple with the Bordercolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBordercolor

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetBordercolor(v string)`

SetBordercolor sets Bordercolor field to given value.

### HasBordercolor

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasBordercolor() bool`

HasBordercolor returns a boolean if a field has been set.

### GetBorderstyle

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetBorderstyle() string`

GetBorderstyle returns the Borderstyle field if non-nil, zero value otherwise.

### GetBorderstyleOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetBorderstyleOk() (*string, bool)`

GetBorderstyleOk returns a tuple with the Borderstyle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBorderstyle

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetBorderstyle(v string)`

SetBorderstyle sets Borderstyle field to given value.

### HasBorderstyle

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasBorderstyle() bool`

HasBorderstyle returns a boolean if a field has been set.

### GetCourse

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetCustomtext

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetCustomtext() string`

GetCustomtext returns the Customtext field if non-nil, zero value otherwise.

### GetCustomtextOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetCustomtextOk() (*string, bool)`

GetCustomtextOk returns a tuple with the Customtext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomtext

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetCustomtext(v string)`

SetCustomtext sets Customtext field to given value.

### HasCustomtext

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasCustomtext() bool`

HasCustomtext returns a boolean if a field has been set.

### GetDatefmt

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetDatefmt() int32`

GetDatefmt returns the Datefmt field if non-nil, zero value otherwise.

### GetDatefmtOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetDatefmtOk() (*int32, bool)`

GetDatefmtOk returns a tuple with the Datefmt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatefmt

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetDatefmt(v int32)`

SetDatefmt sets Datefmt field to given value.

### HasDatefmt

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasDatefmt() bool`

HasDatefmt returns a boolean if a field has been set.

### GetDelivery

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetDelivery() int32`

GetDelivery returns the Delivery field if non-nil, zero value otherwise.

### GetDeliveryOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetDeliveryOk() (*int32, bool)`

GetDeliveryOk returns a tuple with the Delivery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelivery

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetDelivery(v int32)`

SetDelivery sets Delivery field to given value.

### HasDelivery

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasDelivery() bool`

HasDelivery returns a boolean if a field has been set.

### GetEmailothers

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetEmailothers() string`

GetEmailothers returns the Emailothers field if non-nil, zero value otherwise.

### GetEmailothersOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetEmailothersOk() (*string, bool)`

GetEmailothersOk returns a tuple with the Emailothers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailothers

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetEmailothers(v string)`

SetEmailothers sets Emailothers field to given value.

### HasEmailothers

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasEmailothers() bool`

HasEmailothers returns a boolean if a field has been set.

### GetEmailteachers

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetEmailteachers() int32`

GetEmailteachers returns the Emailteachers field if non-nil, zero value otherwise.

### GetEmailteachersOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetEmailteachersOk() (*int32, bool)`

GetEmailteachersOk returns a tuple with the Emailteachers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailteachers

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetEmailteachers(v int32)`

SetEmailteachers sets Emailteachers field to given value.

### HasEmailteachers

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasEmailteachers() bool`

HasEmailteachers returns a boolean if a field has been set.

### GetGradefmt

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetGradefmt() int32`

GetGradefmt returns the Gradefmt field if non-nil, zero value otherwise.

### GetGradefmtOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetGradefmtOk() (*int32, bool)`

GetGradefmtOk returns a tuple with the Gradefmt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradefmt

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetGradefmt(v int32)`

SetGradefmt sets Gradefmt field to given value.

### HasGradefmt

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasGradefmt() bool`

HasGradefmt returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetIomadcertificatetype

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetIomadcertificatetype() string`

GetIomadcertificatetype returns the Iomadcertificatetype field if non-nil, zero value otherwise.

### GetIomadcertificatetypeOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetIomadcertificatetypeOk() (*string, bool)`

GetIomadcertificatetypeOk returns a tuple with the Iomadcertificatetype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIomadcertificatetype

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetIomadcertificatetype(v string)`

SetIomadcertificatetype sets Iomadcertificatetype field to given value.

### HasIomadcertificatetype

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasIomadcertificatetype() bool`

HasIomadcertificatetype returns a boolean if a field has been set.

### GetName

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOrientation

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetOrientation() string`

GetOrientation returns the Orientation field if non-nil, zero value otherwise.

### GetOrientationOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetOrientationOk() (*string, bool)`

GetOrientationOk returns a tuple with the Orientation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrientation

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetOrientation(v string)`

SetOrientation sets Orientation field to given value.

### HasOrientation

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasOrientation() bool`

HasOrientation returns a boolean if a field has been set.

### GetPrintdate

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintdate() string`

GetPrintdate returns the Printdate field if non-nil, zero value otherwise.

### GetPrintdateOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintdateOk() (*string, bool)`

GetPrintdateOk returns a tuple with the Printdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintdate

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintdate(v string)`

SetPrintdate sets Printdate field to given value.

### HasPrintdate

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintdate() bool`

HasPrintdate returns a boolean if a field has been set.

### GetPrintgrade

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintgrade() int32`

GetPrintgrade returns the Printgrade field if non-nil, zero value otherwise.

### GetPrintgradeOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintgradeOk() (*int32, bool)`

GetPrintgradeOk returns a tuple with the Printgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintgrade

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintgrade(v int32)`

SetPrintgrade sets Printgrade field to given value.

### HasPrintgrade

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintgrade() bool`

HasPrintgrade returns a boolean if a field has been set.

### GetPrinthours

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrinthours() string`

GetPrinthours returns the Printhours field if non-nil, zero value otherwise.

### GetPrinthoursOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrinthoursOk() (*string, bool)`

GetPrinthoursOk returns a tuple with the Printhours field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrinthours

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrinthours(v string)`

SetPrinthours sets Printhours field to given value.

### HasPrinthours

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrinthours() bool`

HasPrinthours returns a boolean if a field has been set.

### GetPrintnumber

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintnumber() int32`

GetPrintnumber returns the Printnumber field if non-nil, zero value otherwise.

### GetPrintnumberOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintnumberOk() (*int32, bool)`

GetPrintnumberOk returns a tuple with the Printnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintnumber

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintnumber(v int32)`

SetPrintnumber sets Printnumber field to given value.

### HasPrintnumber

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintnumber() bool`

HasPrintnumber returns a boolean if a field has been set.

### GetPrintoutcome

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintoutcome() int32`

GetPrintoutcome returns the Printoutcome field if non-nil, zero value otherwise.

### GetPrintoutcomeOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintoutcomeOk() (*int32, bool)`

GetPrintoutcomeOk returns a tuple with the Printoutcome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintoutcome

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintoutcome(v int32)`

SetPrintoutcome sets Printoutcome field to given value.

### HasPrintoutcome

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintoutcome() bool`

HasPrintoutcome returns a boolean if a field has been set.

### GetPrintseal

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintseal() string`

GetPrintseal returns the Printseal field if non-nil, zero value otherwise.

### GetPrintsealOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintsealOk() (*string, bool)`

GetPrintsealOk returns a tuple with the Printseal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintseal

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintseal(v string)`

SetPrintseal sets Printseal field to given value.

### HasPrintseal

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintseal() bool`

HasPrintseal returns a boolean if a field has been set.

### GetPrintsignature

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintsignature() string`

GetPrintsignature returns the Printsignature field if non-nil, zero value otherwise.

### GetPrintsignatureOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintsignatureOk() (*string, bool)`

GetPrintsignatureOk returns a tuple with the Printsignature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintsignature

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintsignature(v string)`

SetPrintsignature sets Printsignature field to given value.

### HasPrintsignature

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintsignature() bool`

HasPrintsignature returns a boolean if a field has been set.

### GetPrintteacher

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintteacher() int32`

GetPrintteacher returns the Printteacher field if non-nil, zero value otherwise.

### GetPrintteacherOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintteacherOk() (*int32, bool)`

GetPrintteacherOk returns a tuple with the Printteacher field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintteacher

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintteacher(v int32)`

SetPrintteacher sets Printteacher field to given value.

### HasPrintteacher

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintteacher() bool`

HasPrintteacher returns a boolean if a field has been set.

### GetPrintwmark

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintwmark() string`

GetPrintwmark returns the Printwmark field if non-nil, zero value otherwise.

### GetPrintwmarkOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetPrintwmarkOk() (*string, bool)`

GetPrintwmarkOk returns a tuple with the Printwmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrintwmark

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetPrintwmark(v string)`

SetPrintwmark sets Printwmark field to given value.

### HasPrintwmark

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasPrintwmark() bool`

HasPrintwmark returns a boolean if a field has been set.

### GetReportcert

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetReportcert() int32`

GetReportcert returns the Reportcert field if non-nil, zero value otherwise.

### GetReportcertOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetReportcertOk() (*int32, bool)`

GetReportcertOk returns a tuple with the Reportcert field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportcert

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetReportcert(v int32)`

SetReportcert sets Reportcert field to given value.

### HasReportcert

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasReportcert() bool`

HasReportcert returns a boolean if a field has been set.

### GetRequiredtime

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetRequiredtime() int32`

GetRequiredtime returns the Requiredtime field if non-nil, zero value otherwise.

### GetRequiredtimeOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetRequiredtimeOk() (*int32, bool)`

GetRequiredtimeOk returns a tuple with the Requiredtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredtime

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetRequiredtime(v int32)`

SetRequiredtime sets Requiredtime field to given value.

### HasRequiredtime

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasRequiredtime() bool`

HasRequiredtime returns a boolean if a field has been set.

### GetRequiredtimenotmet

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetRequiredtimenotmet() int32`

GetRequiredtimenotmet returns the Requiredtimenotmet field if non-nil, zero value otherwise.

### GetRequiredtimenotmetOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetRequiredtimenotmetOk() (*int32, bool)`

GetRequiredtimenotmetOk returns a tuple with the Requiredtimenotmet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredtimenotmet

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetRequiredtimenotmet(v int32)`

SetRequiredtimenotmet sets Requiredtimenotmet field to given value.

### HasRequiredtimenotmet

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasRequiredtimenotmet() bool`

HasRequiredtimenotmet returns a boolean if a field has been set.

### GetSavecert

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetSavecert() int32`

GetSavecert returns the Savecert field if non-nil, zero value otherwise.

### GetSavecertOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetSavecertOk() (*int32, bool)`

GetSavecertOk returns a tuple with the Savecert field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSavecert

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetSavecert(v int32)`

SetSavecert sets Savecert field to given value.

### HasSavecert

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasSavecert() bool`

HasSavecert returns a boolean if a field has been set.

### GetSection

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


