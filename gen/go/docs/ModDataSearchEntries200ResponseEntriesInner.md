# ModDataSearchEntries200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | Pointer to **bool** | Whether the entry has been approved (if the database is configured in that way). | [optional] [default to 0]
**Canmanageentry** | Pointer to **bool** | Whether the current user can manage this entry | [optional] 
**Contents** | Pointer to [**[]ModDataGetEntry200ResponseEntryContentsInner**](ModDataGetEntry200ResponseEntryContentsInner.md) |  | [optional] 
**Dataid** | Pointer to **int32** | The database id this record belongs to. | [optional] [default to 0]
**Fullname** | Pointer to **string** | The user who created the entry fullname. | [optional] 
**Groupid** | Pointer to **int32** | The group id this record belongs to (0 for no groups). | [optional] [default to 0]
**Id** | Pointer to **int32** | Record id. | [optional] 
**Tags** | Pointer to [**[]ModDataGetEntries200ResponseEntriesInnerTagsInner**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Timecreated** | Pointer to **int32** | Time the record was created. | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | Last time the record was modified. | [optional] [default to 0]
**Userid** | Pointer to **int32** | The id of the user who created the record. | [optional] [default to 0]

## Methods

### NewModDataSearchEntries200ResponseEntriesInner

`func NewModDataSearchEntries200ResponseEntriesInner() *ModDataSearchEntries200ResponseEntriesInner`

NewModDataSearchEntries200ResponseEntriesInner instantiates a new ModDataSearchEntries200ResponseEntriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataSearchEntries200ResponseEntriesInnerWithDefaults

`func NewModDataSearchEntries200ResponseEntriesInnerWithDefaults() *ModDataSearchEntries200ResponseEntriesInner`

NewModDataSearchEntries200ResponseEntriesInnerWithDefaults instantiates a new ModDataSearchEntries200ResponseEntriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApproved

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetApproved() bool`

GetApproved returns the Approved field if non-nil, zero value otherwise.

### GetApprovedOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetApprovedOk() (*bool, bool)`

GetApprovedOk returns a tuple with the Approved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApproved

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetApproved(v bool)`

SetApproved sets Approved field to given value.

### HasApproved

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasApproved() bool`

HasApproved returns a boolean if a field has been set.

### GetCanmanageentry

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetCanmanageentry() bool`

GetCanmanageentry returns the Canmanageentry field if non-nil, zero value otherwise.

### GetCanmanageentryOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetCanmanageentryOk() (*bool, bool)`

GetCanmanageentryOk returns a tuple with the Canmanageentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanageentry

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetCanmanageentry(v bool)`

SetCanmanageentry sets Canmanageentry field to given value.

### HasCanmanageentry

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasCanmanageentry() bool`

HasCanmanageentry returns a boolean if a field has been set.

### GetContents

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetContents() []ModDataGetEntry200ResponseEntryContentsInner`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetContentsOk() (*[]ModDataGetEntry200ResponseEntryContentsInner, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetContents(v []ModDataGetEntry200ResponseEntryContentsInner)`

SetContents sets Contents field to given value.

### HasContents

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetDataid

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetDataid() int32`

GetDataid returns the Dataid field if non-nil, zero value otherwise.

### GetDataidOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetDataidOk() (*int32, bool)`

GetDataidOk returns a tuple with the Dataid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataid

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetDataid(v int32)`

SetDataid sets Dataid field to given value.

### HasDataid

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasDataid() bool`

HasDataid returns a boolean if a field has been set.

### GetFullname

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetGroupid

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetTags

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUserid

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModDataSearchEntries200ResponseEntriesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModDataSearchEntries200ResponseEntriesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModDataSearchEntries200ResponseEntriesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


