# CoreBadgesGetUserBadgeByHash200ResponseBadgeInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alignment** | Pointer to [**[]CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner.md) |  | [optional] 
**Attachment** | Pointer to **int32** | Attachment | [optional] [default to 1]
**Badgeurl** | Pointer to **string** | Badge URL | [optional] [default to "null"]
**Courseid** | Pointer to **int32** | Course id | [optional] [default to null]
**Dateexpire** | Pointer to **int32** | Date expire | [optional] [default to null]
**Dateissued** | Pointer to **int32** | Date issued | [optional] [default to 0]
**Description** | Pointer to **string** | Badge description | [optional] [default to "null"]
**Email** | Pointer to **string** | User email | [optional] [default to "null"]
**Endorsement** | Pointer to [**CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.md) |  | [optional] 
**Expiredate** | Pointer to **int32** | Expire date | [optional] [default to null]
**Expireperiod** | Pointer to **int32** | Expire period | [optional] [default to null]
**Id** | Pointer to **int32** | Badge id | [optional] 
**Imageauthoremail** | Pointer to **string** | Email of the image author | [optional] [default to "null"]
**Imageauthorname** | Pointer to **string** | Name of the image author | [optional] [default to "null"]
**Imageauthorurl** | Pointer to **string** | URL of the image author | [optional] [default to "null"]
**Imagecaption** | Pointer to **string** | Caption of the image | [optional] [default to "null"]
**Issuedid** | Pointer to **int32** | Issued id | [optional] [default to null]
**Issuercontact** | Pointer to **string** | Issuer contact | [optional] [default to "null"]
**Issuername** | Pointer to **string** | Issuer name | [optional] [default to "null"]
**Issuerurl** | Pointer to **string** | Issuer URL | [optional] [default to "null"]
**Language** | Pointer to **string** | Language | [optional] [default to "null"]
**Message** | Pointer to **string** | Message | [optional] [default to "null"]
**Messagesubject** | Pointer to **string** | Message subject | [optional] [default to "null"]
**Name** | Pointer to **string** | Badge name | [optional] [default to "null"]
**Nextcron** | Pointer to **int32** | Next cron | [optional] [default to null]
**Notification** | Pointer to **int32** | Whether to notify when badge is awarded | [optional] [default to 1]
**Relatedbadges** | Pointer to [**[]CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.md) |  | [optional] 
**Status** | Pointer to **int32** | Status | [optional] [default to 0]
**Timecreated** | Pointer to **int32** | Time created | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | Time modified | [optional] [default to 0]
**Type** | Pointer to **int32** | Type | [optional] [default to 1]
**Uniquehash** | Pointer to **string** | Unique hash | [optional] [default to "null"]
**Usercreated** | Pointer to **int32** | User created | [optional] [default to null]
**Usermodified** | Pointer to **int32** | User modified | [optional] [default to null]
**Version** | Pointer to **string** | Version | [optional] 
**Visible** | Pointer to **int32** | Visible | [optional] [default to 0]

## Methods

### NewCoreBadgesGetUserBadgeByHash200ResponseBadgeInner

`func NewCoreBadgesGetUserBadgeByHash200ResponseBadgeInner() *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner`

NewCoreBadgesGetUserBadgeByHash200ResponseBadgeInner instantiates a new CoreBadgesGetUserBadgeByHash200ResponseBadgeInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBadgesGetUserBadgeByHash200ResponseBadgeInnerWithDefaults

`func NewCoreBadgesGetUserBadgeByHash200ResponseBadgeInnerWithDefaults() *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner`

NewCoreBadgesGetUserBadgeByHash200ResponseBadgeInnerWithDefaults instantiates a new CoreBadgesGetUserBadgeByHash200ResponseBadgeInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAlignment

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetAlignment() []CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner`

GetAlignment returns the Alignment field if non-nil, zero value otherwise.

### GetAlignmentOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetAlignmentOk() (*[]CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner, bool)`

GetAlignmentOk returns a tuple with the Alignment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlignment

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetAlignment(v []CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner)`

SetAlignment sets Alignment field to given value.

### HasAlignment

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasAlignment() bool`

HasAlignment returns a boolean if a field has been set.

### GetAttachment

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetAttachment() int32`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetAttachmentOk() (*int32, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetAttachment(v int32)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetBadgeurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetBadgeurl() string`

GetBadgeurl returns the Badgeurl field if non-nil, zero value otherwise.

### GetBadgeurlOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetBadgeurlOk() (*string, bool)`

GetBadgeurlOk returns a tuple with the Badgeurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBadgeurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetBadgeurl(v string)`

SetBadgeurl sets Badgeurl field to given value.

### HasBadgeurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasBadgeurl() bool`

HasBadgeurl returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDateexpire

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetDateexpire() int32`

GetDateexpire returns the Dateexpire field if non-nil, zero value otherwise.

### GetDateexpireOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetDateexpireOk() (*int32, bool)`

GetDateexpireOk returns a tuple with the Dateexpire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateexpire

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetDateexpire(v int32)`

SetDateexpire sets Dateexpire field to given value.

### HasDateexpire

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasDateexpire() bool`

HasDateexpire returns a boolean if a field has been set.

### GetDateissued

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetDateissued() int32`

GetDateissued returns the Dateissued field if non-nil, zero value otherwise.

### GetDateissuedOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetDateissuedOk() (*int32, bool)`

GetDateissuedOk returns a tuple with the Dateissued field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateissued

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetDateissued(v int32)`

SetDateissued sets Dateissued field to given value.

### HasDateissued

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasDateissued() bool`

HasDateissued returns a boolean if a field has been set.

### GetDescription

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetEmail

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetEndorsement

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetEndorsement() CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement`

GetEndorsement returns the Endorsement field if non-nil, zero value otherwise.

### GetEndorsementOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetEndorsementOk() (*CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement, bool)`

GetEndorsementOk returns a tuple with the Endorsement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndorsement

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetEndorsement(v CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement)`

SetEndorsement sets Endorsement field to given value.

### HasEndorsement

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasEndorsement() bool`

HasEndorsement returns a boolean if a field has been set.

### GetExpiredate

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetExpiredate() int32`

GetExpiredate returns the Expiredate field if non-nil, zero value otherwise.

### GetExpiredateOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetExpiredateOk() (*int32, bool)`

GetExpiredateOk returns a tuple with the Expiredate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiredate

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetExpiredate(v int32)`

SetExpiredate sets Expiredate field to given value.

### HasExpiredate

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasExpiredate() bool`

HasExpiredate returns a boolean if a field has been set.

### GetExpireperiod

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetExpireperiod() int32`

GetExpireperiod returns the Expireperiod field if non-nil, zero value otherwise.

### GetExpireperiodOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetExpireperiodOk() (*int32, bool)`

GetExpireperiodOk returns a tuple with the Expireperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpireperiod

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetExpireperiod(v int32)`

SetExpireperiod sets Expireperiod field to given value.

### HasExpireperiod

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasExpireperiod() bool`

HasExpireperiod returns a boolean if a field has been set.

### GetId

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetImageauthoremail

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImageauthoremail() string`

GetImageauthoremail returns the Imageauthoremail field if non-nil, zero value otherwise.

### GetImageauthoremailOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImageauthoremailOk() (*string, bool)`

GetImageauthoremailOk returns a tuple with the Imageauthoremail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageauthoremail

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetImageauthoremail(v string)`

SetImageauthoremail sets Imageauthoremail field to given value.

### HasImageauthoremail

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasImageauthoremail() bool`

HasImageauthoremail returns a boolean if a field has been set.

### GetImageauthorname

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImageauthorname() string`

GetImageauthorname returns the Imageauthorname field if non-nil, zero value otherwise.

### GetImageauthornameOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImageauthornameOk() (*string, bool)`

GetImageauthornameOk returns a tuple with the Imageauthorname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageauthorname

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetImageauthorname(v string)`

SetImageauthorname sets Imageauthorname field to given value.

### HasImageauthorname

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasImageauthorname() bool`

HasImageauthorname returns a boolean if a field has been set.

### GetImageauthorurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImageauthorurl() string`

GetImageauthorurl returns the Imageauthorurl field if non-nil, zero value otherwise.

### GetImageauthorurlOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImageauthorurlOk() (*string, bool)`

GetImageauthorurlOk returns a tuple with the Imageauthorurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageauthorurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetImageauthorurl(v string)`

SetImageauthorurl sets Imageauthorurl field to given value.

### HasImageauthorurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasImageauthorurl() bool`

HasImageauthorurl returns a boolean if a field has been set.

### GetImagecaption

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImagecaption() string`

GetImagecaption returns the Imagecaption field if non-nil, zero value otherwise.

### GetImagecaptionOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetImagecaptionOk() (*string, bool)`

GetImagecaptionOk returns a tuple with the Imagecaption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImagecaption

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetImagecaption(v string)`

SetImagecaption sets Imagecaption field to given value.

### HasImagecaption

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasImagecaption() bool`

HasImagecaption returns a boolean if a field has been set.

### GetIssuedid

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuedid() int32`

GetIssuedid returns the Issuedid field if non-nil, zero value otherwise.

### GetIssuedidOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuedidOk() (*int32, bool)`

GetIssuedidOk returns a tuple with the Issuedid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuedid

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetIssuedid(v int32)`

SetIssuedid sets Issuedid field to given value.

### HasIssuedid

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasIssuedid() bool`

HasIssuedid returns a boolean if a field has been set.

### GetIssuercontact

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuercontact() string`

GetIssuercontact returns the Issuercontact field if non-nil, zero value otherwise.

### GetIssuercontactOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuercontactOk() (*string, bool)`

GetIssuercontactOk returns a tuple with the Issuercontact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuercontact

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetIssuercontact(v string)`

SetIssuercontact sets Issuercontact field to given value.

### HasIssuercontact

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasIssuercontact() bool`

HasIssuercontact returns a boolean if a field has been set.

### GetIssuername

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuername() string`

GetIssuername returns the Issuername field if non-nil, zero value otherwise.

### GetIssuernameOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuernameOk() (*string, bool)`

GetIssuernameOk returns a tuple with the Issuername field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuername

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetIssuername(v string)`

SetIssuername sets Issuername field to given value.

### HasIssuername

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasIssuername() bool`

HasIssuername returns a boolean if a field has been set.

### GetIssuerurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuerurl() string`

GetIssuerurl returns the Issuerurl field if non-nil, zero value otherwise.

### GetIssuerurlOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetIssuerurlOk() (*string, bool)`

GetIssuerurlOk returns a tuple with the Issuerurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuerurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetIssuerurl(v string)`

SetIssuerurl sets Issuerurl field to given value.

### HasIssuerurl

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasIssuerurl() bool`

HasIssuerurl returns a boolean if a field has been set.

### GetLanguage

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetLanguage(v string)`

SetLanguage sets Language field to given value.

### HasLanguage

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasLanguage() bool`

HasLanguage returns a boolean if a field has been set.

### GetMessage

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetMessagesubject

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetMessagesubject() string`

GetMessagesubject returns the Messagesubject field if non-nil, zero value otherwise.

### GetMessagesubjectOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetMessagesubjectOk() (*string, bool)`

GetMessagesubjectOk returns a tuple with the Messagesubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagesubject

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetMessagesubject(v string)`

SetMessagesubject sets Messagesubject field to given value.

### HasMessagesubject

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasMessagesubject() bool`

HasMessagesubject returns a boolean if a field has been set.

### GetName

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNextcron

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetNextcron() int32`

GetNextcron returns the Nextcron field if non-nil, zero value otherwise.

### GetNextcronOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetNextcronOk() (*int32, bool)`

GetNextcronOk returns a tuple with the Nextcron field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextcron

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetNextcron(v int32)`

SetNextcron sets Nextcron field to given value.

### HasNextcron

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasNextcron() bool`

HasNextcron returns a boolean if a field has been set.

### GetNotification

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetNotification() int32`

GetNotification returns the Notification field if non-nil, zero value otherwise.

### GetNotificationOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetNotificationOk() (*int32, bool)`

GetNotificationOk returns a tuple with the Notification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotification

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetNotification(v int32)`

SetNotification sets Notification field to given value.

### HasNotification

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasNotification() bool`

HasNotification returns a boolean if a field has been set.

### GetRelatedbadges

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetRelatedbadges() []CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner`

GetRelatedbadges returns the Relatedbadges field if non-nil, zero value otherwise.

### GetRelatedbadgesOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetRelatedbadgesOk() (*[]CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner, bool)`

GetRelatedbadgesOk returns a tuple with the Relatedbadges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedbadges

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetRelatedbadges(v []CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner)`

SetRelatedbadges sets Relatedbadges field to given value.

### HasRelatedbadges

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasRelatedbadges() bool`

HasRelatedbadges returns a boolean if a field has been set.

### GetStatus

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetType

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUniquehash

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetUniquehash() string`

GetUniquehash returns the Uniquehash field if non-nil, zero value otherwise.

### GetUniquehashOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetUniquehashOk() (*string, bool)`

GetUniquehashOk returns a tuple with the Uniquehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniquehash

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetUniquehash(v string)`

SetUniquehash sets Uniquehash field to given value.

### HasUniquehash

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasUniquehash() bool`

HasUniquehash returns a boolean if a field has been set.

### GetUsercreated

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetUsercreated() int32`

GetUsercreated returns the Usercreated field if non-nil, zero value otherwise.

### GetUsercreatedOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetUsercreatedOk() (*int32, bool)`

GetUsercreatedOk returns a tuple with the Usercreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercreated

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetUsercreated(v int32)`

SetUsercreated sets Usercreated field to given value.

### HasUsercreated

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasUsercreated() bool`

HasUsercreated returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.

### GetVersion

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetVisible

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreBadgesGetUserBadgeByHash200ResponseBadgeInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


