# CoreUserGetUsersRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | Pointer to **string** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching user id,                                 \&quot;lastname\&quot; (string) user last name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;firstname\&quot; (string) user first name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;idnumber\&quot; (string) matching user idnumber,                                 \&quot;username\&quot; (string) matching user username,                                 \&quot;email\&quot; (string) user email (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;auth\&quot; (string) matching user auth plugin | [optional] [default to "null"]
**Value** | Pointer to **string** | the value to search | [optional] 

## Methods

### NewCoreUserGetUsersRequestCriteriaInner

`func NewCoreUserGetUsersRequestCriteriaInner() *CoreUserGetUsersRequestCriteriaInner`

NewCoreUserGetUsersRequestCriteriaInner instantiates a new CoreUserGetUsersRequestCriteriaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserGetUsersRequestCriteriaInnerWithDefaults

`func NewCoreUserGetUsersRequestCriteriaInnerWithDefaults() *CoreUserGetUsersRequestCriteriaInner`

NewCoreUserGetUsersRequestCriteriaInnerWithDefaults instantiates a new CoreUserGetUsersRequestCriteriaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *CoreUserGetUsersRequestCriteriaInner) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *CoreUserGetUsersRequestCriteriaInner) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *CoreUserGetUsersRequestCriteriaInner) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *CoreUserGetUsersRequestCriteriaInner) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetValue

`func (o *CoreUserGetUsersRequestCriteriaInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreUserGetUsersRequestCriteriaInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreUserGetUsersRequestCriteriaInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreUserGetUsersRequestCriteriaInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


