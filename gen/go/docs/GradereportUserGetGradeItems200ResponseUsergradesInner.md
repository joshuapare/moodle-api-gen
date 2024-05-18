# GradereportUserGetGradeItems200ResponseUsergradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | course id | [optional] 
**Courseidnumber** | Pointer to **string** | course idnumber | [optional] [default to "null"]
**Gradeitems** | Pointer to [**[]GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner**](GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.md) |  | [optional] 
**Maxdepth** | Pointer to **int32** | table max depth (needed for printing it) | [optional] [default to null]
**Userfullname** | Pointer to **string** | user fullname | [optional] 
**Userid** | Pointer to **int32** | user id | [optional] 
**Useridnumber** | Pointer to **string** | user idnumber | [optional] [default to "null"]

## Methods

### NewGradereportUserGetGradeItems200ResponseUsergradesInner

`func NewGradereportUserGetGradeItems200ResponseUsergradesInner() *GradereportUserGetGradeItems200ResponseUsergradesInner`

NewGradereportUserGetGradeItems200ResponseUsergradesInner instantiates a new GradereportUserGetGradeItems200ResponseUsergradesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportUserGetGradeItems200ResponseUsergradesInnerWithDefaults

`func NewGradereportUserGetGradeItems200ResponseUsergradesInnerWithDefaults() *GradereportUserGetGradeItems200ResponseUsergradesInner`

NewGradereportUserGetGradeItems200ResponseUsergradesInnerWithDefaults instantiates a new GradereportUserGetGradeItems200ResponseUsergradesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetCourseidnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetCourseidnumber() string`

GetCourseidnumber returns the Courseidnumber field if non-nil, zero value otherwise.

### GetCourseidnumberOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetCourseidnumberOk() (*string, bool)`

GetCourseidnumberOk returns a tuple with the Courseidnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseidnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) SetCourseidnumber(v string)`

SetCourseidnumber sets Courseidnumber field to given value.

### HasCourseidnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) HasCourseidnumber() bool`

HasCourseidnumber returns a boolean if a field has been set.

### GetGradeitems

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetGradeitems() []GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner`

GetGradeitems returns the Gradeitems field if non-nil, zero value otherwise.

### GetGradeitemsOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetGradeitemsOk() (*[]GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner, bool)`

GetGradeitemsOk returns a tuple with the Gradeitems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeitems

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) SetGradeitems(v []GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner)`

SetGradeitems sets Gradeitems field to given value.

### HasGradeitems

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) HasGradeitems() bool`

HasGradeitems returns a boolean if a field has been set.

### GetMaxdepth

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetMaxdepth() int32`

GetMaxdepth returns the Maxdepth field if non-nil, zero value otherwise.

### GetMaxdepthOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetMaxdepthOk() (*int32, bool)`

GetMaxdepthOk returns a tuple with the Maxdepth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxdepth

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) SetMaxdepth(v int32)`

SetMaxdepth sets Maxdepth field to given value.

### HasMaxdepth

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) HasMaxdepth() bool`

HasMaxdepth returns a boolean if a field has been set.

### GetUserfullname

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUseridnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetUseridnumber() string`

GetUseridnumber returns the Useridnumber field if non-nil, zero value otherwise.

### GetUseridnumberOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) GetUseridnumberOk() (*string, bool)`

GetUseridnumberOk returns a tuple with the Useridnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) SetUseridnumber(v string)`

SetUseridnumber sets Useridnumber field to given value.

### HasUseridnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInner) HasUseridnumber() bool`

HasUseridnumber returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


