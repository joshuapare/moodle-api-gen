# ModDataGetEntry200ResponseEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | **bool** | Whether the entry has been approved (if the database is configured in that way). | [default to 0]
**Canmanageentry** | **bool** | Whether the current user can manage this entry | 
**Contents** | Pointer to [**[]ModDataGetEntry200ResponseEntryContentsInner**](ModDataGetEntry200ResponseEntryContentsInner.md) |  | [optional] 
**Dataid** | **int32** | The database id this record belongs to. | [default to 0]
**Fullname** | Pointer to **string** | The user who created the entry fullname. | [optional] 
**Groupid** | **int32** | The group id this record belongs to (0 for no groups). | [default to 0]
**Id** | **int32** | Record id. | 
**Tags** | Pointer to [**[]ModDataGetEntries200ResponseEntriesInnerTagsInner**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Timecreated** | **int32** | Time the record was created. | [default to 0]
**Timemodified** | **int32** | Last time the record was modified. | [default to 0]
**Userid** | **int32** | The id of the user who created the record. | [default to 0]

## Methods

### NewModDataGetEntry200ResponseEntry

`func NewModDataGetEntry200ResponseEntry(approved bool, canmanageentry bool, dataid int32, groupid int32, id int32, timecreated int32, timemodified int32, userid int32, ) *ModDataGetEntry200ResponseEntry`

NewModDataGetEntry200ResponseEntry instantiates a new ModDataGetEntry200ResponseEntry object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntry200ResponseEntryWithDefaults

`func NewModDataGetEntry200ResponseEntryWithDefaults() *ModDataGetEntry200ResponseEntry`

NewModDataGetEntry200ResponseEntryWithDefaults instantiates a new ModDataGetEntry200ResponseEntry object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApproved

`func (o *ModDataGetEntry200ResponseEntry) GetApproved() bool`

GetApproved returns the Approved field if non-nil, zero value otherwise.

### GetApprovedOk

`func (o *ModDataGetEntry200ResponseEntry) GetApprovedOk() (*bool, bool)`

GetApprovedOk returns a tuple with the Approved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApproved

`func (o *ModDataGetEntry200ResponseEntry) SetApproved(v bool)`

SetApproved sets Approved field to given value.


### GetCanmanageentry

`func (o *ModDataGetEntry200ResponseEntry) GetCanmanageentry() bool`

GetCanmanageentry returns the Canmanageentry field if non-nil, zero value otherwise.

### GetCanmanageentryOk

`func (o *ModDataGetEntry200ResponseEntry) GetCanmanageentryOk() (*bool, bool)`

GetCanmanageentryOk returns a tuple with the Canmanageentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanageentry

`func (o *ModDataGetEntry200ResponseEntry) SetCanmanageentry(v bool)`

SetCanmanageentry sets Canmanageentry field to given value.


### GetContents

`func (o *ModDataGetEntry200ResponseEntry) GetContents() []ModDataGetEntry200ResponseEntryContentsInner`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *ModDataGetEntry200ResponseEntry) GetContentsOk() (*[]ModDataGetEntry200ResponseEntryContentsInner, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *ModDataGetEntry200ResponseEntry) SetContents(v []ModDataGetEntry200ResponseEntryContentsInner)`

SetContents sets Contents field to given value.

### HasContents

`func (o *ModDataGetEntry200ResponseEntry) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetDataid

`func (o *ModDataGetEntry200ResponseEntry) GetDataid() int32`

GetDataid returns the Dataid field if non-nil, zero value otherwise.

### GetDataidOk

`func (o *ModDataGetEntry200ResponseEntry) GetDataidOk() (*int32, bool)`

GetDataidOk returns a tuple with the Dataid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataid

`func (o *ModDataGetEntry200ResponseEntry) SetDataid(v int32)`

SetDataid sets Dataid field to given value.


### GetFullname

`func (o *ModDataGetEntry200ResponseEntry) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *ModDataGetEntry200ResponseEntry) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *ModDataGetEntry200ResponseEntry) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *ModDataGetEntry200ResponseEntry) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetGroupid

`func (o *ModDataGetEntry200ResponseEntry) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModDataGetEntry200ResponseEntry) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModDataGetEntry200ResponseEntry) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.


### GetId

`func (o *ModDataGetEntry200ResponseEntry) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModDataGetEntry200ResponseEntry) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModDataGetEntry200ResponseEntry) SetId(v int32)`

SetId sets Id field to given value.


### GetTags

`func (o *ModDataGetEntry200ResponseEntry) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModDataGetEntry200ResponseEntry) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModDataGetEntry200ResponseEntry) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModDataGetEntry200ResponseEntry) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModDataGetEntry200ResponseEntry) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModDataGetEntry200ResponseEntry) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModDataGetEntry200ResponseEntry) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModDataGetEntry200ResponseEntry) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModDataGetEntry200ResponseEntry) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModDataGetEntry200ResponseEntry) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUserid

`func (o *ModDataGetEntry200ResponseEntry) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModDataGetEntry200ResponseEntry) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModDataGetEntry200ResponseEntry) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


