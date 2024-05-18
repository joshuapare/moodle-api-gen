# CoreBadgesGetUserBadges200ResponseBadgesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alignment** | Pointer to [**[]CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner**](CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.md) |  | [optional] 
**Attachment** | Pointer to **int32** | Attachment | [optional] [default to 1]
**Badgeurl** | Pointer to **string** | Badge URL | [optional] 
**Courseid** | Pointer to **int32** | Course id | [optional] 
**Dateexpire** | Pointer to **int32** | Date expire | [optional] 
**Dateissued** | Pointer to **int32** | Date issued | [optional] [default to 0]
**Description** | Pointer to **string** | Badge description | [optional] 
**Email** | Pointer to **string** | User email | [optional] 
**Endorsement** | Pointer to [**CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement**](CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.md) |  | [optional] 
**Expiredate** | Pointer to **int32** | Expire date | [optional] 
**Expireperiod** | Pointer to **int32** | Expire period | [optional] 
**Id** | Pointer to **int32** | Badge id | [optional] 
**Imageauthoremail** | Pointer to **string** | Email of the image author | [optional] 
**Imageauthorname** | Pointer to **string** | Name of the image author | [optional] 
**Imageauthorurl** | Pointer to **string** | URL of the image author | [optional] 
**Imagecaption** | Pointer to **string** | Caption of the image | [optional] 
**Issuedid** | Pointer to **int32** | Issued id | [optional] 
**Issuercontact** | Pointer to **string** | Issuer contact | [optional] 
**Issuername** | Pointer to **string** | Issuer name | [optional] 
**Issuerurl** | Pointer to **string** | Issuer URL | [optional] 
**Language** | Pointer to **string** | Language | [optional] 
**Message** | Pointer to **string** | Message | [optional] 
**Messagesubject** | Pointer to **string** | Message subject | [optional] 
**Name** | Pointer to **string** | Badge name | [optional] 
**Nextcron** | Pointer to **int32** | Next cron | [optional] 
**Notification** | Pointer to **int32** | Whether to notify when badge is awarded | [optional] [default to 1]
**Relatedbadges** | Pointer to [**[]CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner**](CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner.md) |  | [optional] 
**Status** | Pointer to **int32** | Status | [optional] [default to 0]
**Timecreated** | Pointer to **int32** | Time created | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | Time modified | [optional] [default to 0]
**Type** | Pointer to **int32** | Type | [optional] [default to 1]
**Uniquehash** | Pointer to **string** | Unique hash | [optional] 
**Usercreated** | Pointer to **int32** | User created | [optional] 
**Usermodified** | Pointer to **int32** | User modified | [optional] 
**Version** | Pointer to **string** | Version | [optional] 
**Visible** | Pointer to **int32** | Visible | [optional] [default to 0]

## Methods

### NewCoreBadgesGetUserBadges200ResponseBadgesInner

`func NewCoreBadgesGetUserBadges200ResponseBadgesInner() *CoreBadgesGetUserBadges200ResponseBadgesInner`

NewCoreBadgesGetUserBadges200ResponseBadgesInner instantiates a new CoreBadgesGetUserBadges200ResponseBadgesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBadgesGetUserBadges200ResponseBadgesInnerWithDefaults

`func NewCoreBadgesGetUserBadges200ResponseBadgesInnerWithDefaults() *CoreBadgesGetUserBadges200ResponseBadgesInner`

NewCoreBadgesGetUserBadges200ResponseBadgesInnerWithDefaults instantiates a new CoreBadgesGetUserBadges200ResponseBadgesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAlignment

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetAlignment() []CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner`

GetAlignment returns the Alignment field if non-nil, zero value otherwise.

### GetAlignmentOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetAlignmentOk() (*[]CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner, bool)`

GetAlignmentOk returns a tuple with the Alignment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlignment

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetAlignment(v []CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner)`

SetAlignment sets Alignment field to given value.

### HasAlignment

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasAlignment() bool`

HasAlignment returns a boolean if a field has been set.

### GetAttachment

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetAttachment() int32`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetAttachmentOk() (*int32, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetAttachment(v int32)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetBadgeurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetBadgeurl() string`

GetBadgeurl returns the Badgeurl field if non-nil, zero value otherwise.

### GetBadgeurlOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetBadgeurlOk() (*string, bool)`

GetBadgeurlOk returns a tuple with the Badgeurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBadgeurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetBadgeurl(v string)`

SetBadgeurl sets Badgeurl field to given value.

### HasBadgeurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasBadgeurl() bool`

HasBadgeurl returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDateexpire

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetDateexpire() int32`

GetDateexpire returns the Dateexpire field if non-nil, zero value otherwise.

### GetDateexpireOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetDateexpireOk() (*int32, bool)`

GetDateexpireOk returns a tuple with the Dateexpire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateexpire

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetDateexpire(v int32)`

SetDateexpire sets Dateexpire field to given value.

### HasDateexpire

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasDateexpire() bool`

HasDateexpire returns a boolean if a field has been set.

### GetDateissued

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetDateissued() int32`

GetDateissued returns the Dateissued field if non-nil, zero value otherwise.

### GetDateissuedOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetDateissuedOk() (*int32, bool)`

GetDateissuedOk returns a tuple with the Dateissued field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateissued

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetDateissued(v int32)`

SetDateissued sets Dateissued field to given value.

### HasDateissued

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasDateissued() bool`

HasDateissued returns a boolean if a field has been set.

### GetDescription

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetEmail

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetEndorsement

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetEndorsement() CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement`

GetEndorsement returns the Endorsement field if non-nil, zero value otherwise.

### GetEndorsementOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetEndorsementOk() (*CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement, bool)`

GetEndorsementOk returns a tuple with the Endorsement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndorsement

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetEndorsement(v CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement)`

SetEndorsement sets Endorsement field to given value.

### HasEndorsement

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasEndorsement() bool`

HasEndorsement returns a boolean if a field has been set.

### GetExpiredate

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetExpiredate() int32`

GetExpiredate returns the Expiredate field if non-nil, zero value otherwise.

### GetExpiredateOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetExpiredateOk() (*int32, bool)`

GetExpiredateOk returns a tuple with the Expiredate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiredate

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetExpiredate(v int32)`

SetExpiredate sets Expiredate field to given value.

### HasExpiredate

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasExpiredate() bool`

HasExpiredate returns a boolean if a field has been set.

### GetExpireperiod

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetExpireperiod() int32`

GetExpireperiod returns the Expireperiod field if non-nil, zero value otherwise.

### GetExpireperiodOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetExpireperiodOk() (*int32, bool)`

GetExpireperiodOk returns a tuple with the Expireperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpireperiod

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetExpireperiod(v int32)`

SetExpireperiod sets Expireperiod field to given value.

### HasExpireperiod

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasExpireperiod() bool`

HasExpireperiod returns a boolean if a field has been set.

### GetId

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetImageauthoremail

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImageauthoremail() string`

GetImageauthoremail returns the Imageauthoremail field if non-nil, zero value otherwise.

### GetImageauthoremailOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImageauthoremailOk() (*string, bool)`

GetImageauthoremailOk returns a tuple with the Imageauthoremail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageauthoremail

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetImageauthoremail(v string)`

SetImageauthoremail sets Imageauthoremail field to given value.

### HasImageauthoremail

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasImageauthoremail() bool`

HasImageauthoremail returns a boolean if a field has been set.

### GetImageauthorname

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImageauthorname() string`

GetImageauthorname returns the Imageauthorname field if non-nil, zero value otherwise.

### GetImageauthornameOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImageauthornameOk() (*string, bool)`

GetImageauthornameOk returns a tuple with the Imageauthorname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageauthorname

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetImageauthorname(v string)`

SetImageauthorname sets Imageauthorname field to given value.

### HasImageauthorname

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasImageauthorname() bool`

HasImageauthorname returns a boolean if a field has been set.

### GetImageauthorurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImageauthorurl() string`

GetImageauthorurl returns the Imageauthorurl field if non-nil, zero value otherwise.

### GetImageauthorurlOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImageauthorurlOk() (*string, bool)`

GetImageauthorurlOk returns a tuple with the Imageauthorurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageauthorurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetImageauthorurl(v string)`

SetImageauthorurl sets Imageauthorurl field to given value.

### HasImageauthorurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasImageauthorurl() bool`

HasImageauthorurl returns a boolean if a field has been set.

### GetImagecaption

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImagecaption() string`

GetImagecaption returns the Imagecaption field if non-nil, zero value otherwise.

### GetImagecaptionOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetImagecaptionOk() (*string, bool)`

GetImagecaptionOk returns a tuple with the Imagecaption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImagecaption

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetImagecaption(v string)`

SetImagecaption sets Imagecaption field to given value.

### HasImagecaption

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasImagecaption() bool`

HasImagecaption returns a boolean if a field has been set.

### GetIssuedid

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuedid() int32`

GetIssuedid returns the Issuedid field if non-nil, zero value otherwise.

### GetIssuedidOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuedidOk() (*int32, bool)`

GetIssuedidOk returns a tuple with the Issuedid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuedid

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetIssuedid(v int32)`

SetIssuedid sets Issuedid field to given value.

### HasIssuedid

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasIssuedid() bool`

HasIssuedid returns a boolean if a field has been set.

### GetIssuercontact

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuercontact() string`

GetIssuercontact returns the Issuercontact field if non-nil, zero value otherwise.

### GetIssuercontactOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuercontactOk() (*string, bool)`

GetIssuercontactOk returns a tuple with the Issuercontact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuercontact

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetIssuercontact(v string)`

SetIssuercontact sets Issuercontact field to given value.

### HasIssuercontact

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasIssuercontact() bool`

HasIssuercontact returns a boolean if a field has been set.

### GetIssuername

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuername() string`

GetIssuername returns the Issuername field if non-nil, zero value otherwise.

### GetIssuernameOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuernameOk() (*string, bool)`

GetIssuernameOk returns a tuple with the Issuername field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuername

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetIssuername(v string)`

SetIssuername sets Issuername field to given value.

### HasIssuername

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasIssuername() bool`

HasIssuername returns a boolean if a field has been set.

### GetIssuerurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuerurl() string`

GetIssuerurl returns the Issuerurl field if non-nil, zero value otherwise.

### GetIssuerurlOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetIssuerurlOk() (*string, bool)`

GetIssuerurlOk returns a tuple with the Issuerurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuerurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetIssuerurl(v string)`

SetIssuerurl sets Issuerurl field to given value.

### HasIssuerurl

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasIssuerurl() bool`

HasIssuerurl returns a boolean if a field has been set.

### GetLanguage

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetLanguage(v string)`

SetLanguage sets Language field to given value.

### HasLanguage

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasLanguage() bool`

HasLanguage returns a boolean if a field has been set.

### GetMessage

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetMessagesubject

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetMessagesubject() string`

GetMessagesubject returns the Messagesubject field if non-nil, zero value otherwise.

### GetMessagesubjectOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetMessagesubjectOk() (*string, bool)`

GetMessagesubjectOk returns a tuple with the Messagesubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagesubject

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetMessagesubject(v string)`

SetMessagesubject sets Messagesubject field to given value.

### HasMessagesubject

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasMessagesubject() bool`

HasMessagesubject returns a boolean if a field has been set.

### GetName

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNextcron

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetNextcron() int32`

GetNextcron returns the Nextcron field if non-nil, zero value otherwise.

### GetNextcronOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetNextcronOk() (*int32, bool)`

GetNextcronOk returns a tuple with the Nextcron field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextcron

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetNextcron(v int32)`

SetNextcron sets Nextcron field to given value.

### HasNextcron

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasNextcron() bool`

HasNextcron returns a boolean if a field has been set.

### GetNotification

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetNotification() int32`

GetNotification returns the Notification field if non-nil, zero value otherwise.

### GetNotificationOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetNotificationOk() (*int32, bool)`

GetNotificationOk returns a tuple with the Notification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotification

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetNotification(v int32)`

SetNotification sets Notification field to given value.

### HasNotification

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasNotification() bool`

HasNotification returns a boolean if a field has been set.

### GetRelatedbadges

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetRelatedbadges() []CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner`

GetRelatedbadges returns the Relatedbadges field if non-nil, zero value otherwise.

### GetRelatedbadgesOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetRelatedbadgesOk() (*[]CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner, bool)`

GetRelatedbadgesOk returns a tuple with the Relatedbadges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedbadges

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetRelatedbadges(v []CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner)`

SetRelatedbadges sets Relatedbadges field to given value.

### HasRelatedbadges

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasRelatedbadges() bool`

HasRelatedbadges returns a boolean if a field has been set.

### GetStatus

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetType

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUniquehash

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetUniquehash() string`

GetUniquehash returns the Uniquehash field if non-nil, zero value otherwise.

### GetUniquehashOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetUniquehashOk() (*string, bool)`

GetUniquehashOk returns a tuple with the Uniquehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniquehash

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetUniquehash(v string)`

SetUniquehash sets Uniquehash field to given value.

### HasUniquehash

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasUniquehash() bool`

HasUniquehash returns a boolean if a field has been set.

### GetUsercreated

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetUsercreated() int32`

GetUsercreated returns the Usercreated field if non-nil, zero value otherwise.

### GetUsercreatedOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetUsercreatedOk() (*int32, bool)`

GetUsercreatedOk returns a tuple with the Usercreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercreated

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetUsercreated(v int32)`

SetUsercreated sets Usercreated field to given value.

### HasUsercreated

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasUsercreated() bool`

HasUsercreated returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.

### GetVersion

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetVisible

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreBadgesGetUserBadges200ResponseBadgesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


