# ToolDataprivacyGetDataRequest200ResponseResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowfiltering** | Pointer to **bool** | allowfiltering | [optional] [default to false]
**Approvedeny** | Pointer to **bool** | approvedeny | [optional] [default to false]
**Canmarkcomplete** | Pointer to **bool** | canmarkcomplete | [optional] [default to false]
**Canreview** | Pointer to **bool** | canreview | [optional] [default to false]
**Comments** | **string** | comments | [default to ""]
**Commentsformat** | **int32** | commentsformat | [default to 2]
**Creationmethod** | **int32** | creationmethod | [default to 0]
**Dpo** | **int32** | dpo | [default to 0]
**Dpocomment** | **string** | dpocomment | [default to ""]
**Dpocommentformat** | **int32** | dpocommentformat | [default to 2]
**Dpouser** | Pointer to [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**Foruser** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**Id** | **int32** | id | [default to 0]
**Messagehtml** | Pointer to **string** | messagehtml | [optional] [default to "null"]
**Requestedby** | **int32** | requestedby | [default to 0]
**Requestedbyuser** | Pointer to [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**Status** | **int32** | status | [default to 2]
**Statuslabel** | **string** | statuslabel | [default to "null"]
**Statuslabelclass** | **string** | statuslabelclass | [default to "null"]
**Systemapproved** | **bool** | systemapproved | [default to false]
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Type** | **int32** | type | 
**Typename** | **string** | typename | [default to "null"]
**Typenameshort** | **string** | typenameshort | [default to "null"]
**Userid** | **int32** | userid | [default to {}]
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewToolDataprivacyGetDataRequest200ResponseResult

`func NewToolDataprivacyGetDataRequest200ResponseResult(comments string, commentsformat int32, creationmethod int32, dpo int32, dpocomment string, dpocommentformat int32, foruser CoreCompetencyGradeCompetency200ResponseActionuser, id int32, requestedby int32, status int32, statuslabel string, statuslabelclass string, systemapproved bool, timecreated int32, timemodified int32, type_ int32, typename string, typenameshort string, userid int32, usermodified int32, ) *ToolDataprivacyGetDataRequest200ResponseResult`

NewToolDataprivacyGetDataRequest200ResponseResult instantiates a new ToolDataprivacyGetDataRequest200ResponseResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolDataprivacyGetDataRequest200ResponseResultWithDefaults

`func NewToolDataprivacyGetDataRequest200ResponseResultWithDefaults() *ToolDataprivacyGetDataRequest200ResponseResult`

NewToolDataprivacyGetDataRequest200ResponseResultWithDefaults instantiates a new ToolDataprivacyGetDataRequest200ResponseResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllowfiltering

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetAllowfiltering() bool`

GetAllowfiltering returns the Allowfiltering field if non-nil, zero value otherwise.

### GetAllowfilteringOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetAllowfilteringOk() (*bool, bool)`

GetAllowfilteringOk returns a tuple with the Allowfiltering field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowfiltering

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetAllowfiltering(v bool)`

SetAllowfiltering sets Allowfiltering field to given value.

### HasAllowfiltering

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) HasAllowfiltering() bool`

HasAllowfiltering returns a boolean if a field has been set.

### GetApprovedeny

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetApprovedeny() bool`

GetApprovedeny returns the Approvedeny field if non-nil, zero value otherwise.

### GetApprovedenyOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetApprovedenyOk() (*bool, bool)`

GetApprovedenyOk returns a tuple with the Approvedeny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApprovedeny

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetApprovedeny(v bool)`

SetApprovedeny sets Approvedeny field to given value.

### HasApprovedeny

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) HasApprovedeny() bool`

HasApprovedeny returns a boolean if a field has been set.

### GetCanmarkcomplete

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCanmarkcomplete() bool`

GetCanmarkcomplete returns the Canmarkcomplete field if non-nil, zero value otherwise.

### GetCanmarkcompleteOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCanmarkcompleteOk() (*bool, bool)`

GetCanmarkcompleteOk returns a tuple with the Canmarkcomplete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmarkcomplete

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetCanmarkcomplete(v bool)`

SetCanmarkcomplete sets Canmarkcomplete field to given value.

### HasCanmarkcomplete

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) HasCanmarkcomplete() bool`

HasCanmarkcomplete returns a boolean if a field has been set.

### GetCanreview

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCanreview() bool`

GetCanreview returns the Canreview field if non-nil, zero value otherwise.

### GetCanreviewOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCanreviewOk() (*bool, bool)`

GetCanreviewOk returns a tuple with the Canreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreview

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetCanreview(v bool)`

SetCanreview sets Canreview field to given value.

### HasCanreview

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) HasCanreview() bool`

HasCanreview returns a boolean if a field has been set.

### GetComments

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetComments() string`

GetComments returns the Comments field if non-nil, zero value otherwise.

### GetCommentsOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCommentsOk() (*string, bool)`

GetCommentsOk returns a tuple with the Comments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComments

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetComments(v string)`

SetComments sets Comments field to given value.


### GetCommentsformat

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCommentsformat() int32`

GetCommentsformat returns the Commentsformat field if non-nil, zero value otherwise.

### GetCommentsformatOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCommentsformatOk() (*int32, bool)`

GetCommentsformatOk returns a tuple with the Commentsformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommentsformat

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetCommentsformat(v int32)`

SetCommentsformat sets Commentsformat field to given value.


### GetCreationmethod

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCreationmethod() int32`

GetCreationmethod returns the Creationmethod field if non-nil, zero value otherwise.

### GetCreationmethodOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetCreationmethodOk() (*int32, bool)`

GetCreationmethodOk returns a tuple with the Creationmethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationmethod

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetCreationmethod(v int32)`

SetCreationmethod sets Creationmethod field to given value.


### GetDpo

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpo() int32`

GetDpo returns the Dpo field if non-nil, zero value otherwise.

### GetDpoOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpoOk() (*int32, bool)`

GetDpoOk returns a tuple with the Dpo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDpo

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetDpo(v int32)`

SetDpo sets Dpo field to given value.


### GetDpocomment

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpocomment() string`

GetDpocomment returns the Dpocomment field if non-nil, zero value otherwise.

### GetDpocommentOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpocommentOk() (*string, bool)`

GetDpocommentOk returns a tuple with the Dpocomment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDpocomment

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetDpocomment(v string)`

SetDpocomment sets Dpocomment field to given value.


### GetDpocommentformat

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpocommentformat() int32`

GetDpocommentformat returns the Dpocommentformat field if non-nil, zero value otherwise.

### GetDpocommentformatOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpocommentformatOk() (*int32, bool)`

GetDpocommentformatOk returns a tuple with the Dpocommentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDpocommentformat

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetDpocommentformat(v int32)`

SetDpocommentformat sets Dpocommentformat field to given value.


### GetDpouser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpouser() CoreCompetencyGradeCompetency200ResponseActionuser`

GetDpouser returns the Dpouser field if non-nil, zero value otherwise.

### GetDpouserOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetDpouserOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetDpouserOk returns a tuple with the Dpouser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDpouser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetDpouser(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetDpouser sets Dpouser field to given value.

### HasDpouser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) HasDpouser() bool`

HasDpouser returns a boolean if a field has been set.

### GetForuser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetForuser() CoreCompetencyGradeCompetency200ResponseActionuser`

GetForuser returns the Foruser field if non-nil, zero value otherwise.

### GetForuserOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetForuserOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetForuserOk returns a tuple with the Foruser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForuser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetForuser(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetForuser sets Foruser field to given value.


### GetId

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetId(v int32)`

SetId sets Id field to given value.


### GetMessagehtml

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetMessagehtml() string`

GetMessagehtml returns the Messagehtml field if non-nil, zero value otherwise.

### GetMessagehtmlOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetMessagehtmlOk() (*string, bool)`

GetMessagehtmlOk returns a tuple with the Messagehtml field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagehtml

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetMessagehtml(v string)`

SetMessagehtml sets Messagehtml field to given value.

### HasMessagehtml

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) HasMessagehtml() bool`

HasMessagehtml returns a boolean if a field has been set.

### GetRequestedby

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetRequestedby() int32`

GetRequestedby returns the Requestedby field if non-nil, zero value otherwise.

### GetRequestedbyOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetRequestedbyOk() (*int32, bool)`

GetRequestedbyOk returns a tuple with the Requestedby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestedby

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetRequestedby(v int32)`

SetRequestedby sets Requestedby field to given value.


### GetRequestedbyuser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetRequestedbyuser() CoreCompetencyGradeCompetency200ResponseActionuser`

GetRequestedbyuser returns the Requestedbyuser field if non-nil, zero value otherwise.

### GetRequestedbyuserOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetRequestedbyuserOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetRequestedbyuserOk returns a tuple with the Requestedbyuser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestedbyuser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetRequestedbyuser(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetRequestedbyuser sets Requestedbyuser field to given value.

### HasRequestedbyuser

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) HasRequestedbyuser() bool`

HasRequestedbyuser returns a boolean if a field has been set.

### GetStatus

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetStatus(v int32)`

SetStatus sets Status field to given value.


### GetStatuslabel

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetStatuslabel() string`

GetStatuslabel returns the Statuslabel field if non-nil, zero value otherwise.

### GetStatuslabelOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetStatuslabelOk() (*string, bool)`

GetStatuslabelOk returns a tuple with the Statuslabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatuslabel

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetStatuslabel(v string)`

SetStatuslabel sets Statuslabel field to given value.


### GetStatuslabelclass

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetStatuslabelclass() string`

GetStatuslabelclass returns the Statuslabelclass field if non-nil, zero value otherwise.

### GetStatuslabelclassOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetStatuslabelclassOk() (*string, bool)`

GetStatuslabelclassOk returns a tuple with the Statuslabelclass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatuslabelclass

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetStatuslabelclass(v string)`

SetStatuslabelclass sets Statuslabelclass field to given value.


### GetSystemapproved

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetSystemapproved() bool`

GetSystemapproved returns the Systemapproved field if non-nil, zero value otherwise.

### GetSystemapprovedOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetSystemapprovedOk() (*bool, bool)`

GetSystemapprovedOk returns a tuple with the Systemapproved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemapproved

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetSystemapproved(v bool)`

SetSystemapproved sets Systemapproved field to given value.


### GetTimecreated

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetType

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetType(v int32)`

SetType sets Type field to given value.


### GetTypename

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTypename() string`

GetTypename returns the Typename field if non-nil, zero value otherwise.

### GetTypenameOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTypenameOk() (*string, bool)`

GetTypenameOk returns a tuple with the Typename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypename

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetTypename(v string)`

SetTypename sets Typename field to given value.


### GetTypenameshort

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTypenameshort() string`

GetTypenameshort returns the Typenameshort field if non-nil, zero value otherwise.

### GetTypenameshortOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetTypenameshortOk() (*string, bool)`

GetTypenameshortOk returns a tuple with the Typenameshort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypenameshort

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetTypenameshort(v string)`

SetTypenameshort sets Typenameshort field to given value.


### GetUserid

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetUsermodified

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *ToolDataprivacyGetDataRequest200ResponseResult) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


