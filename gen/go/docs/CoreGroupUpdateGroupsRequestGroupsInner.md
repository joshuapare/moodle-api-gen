# CoreGroupUpdateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Customfields** | Pointer to [**[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | Pointer to **string** | group description text | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Enrolmentkey** | Pointer to **string** | group enrol secret phrase | [optional] 
**Id** | Pointer to **int32** | ID of the group | [optional] [default to null]
**Idnumber** | Pointer to **string** | id number | [optional] 
**Name** | Pointer to **string** | multilang compatible name, course unique | [optional] 
**Participation** | Pointer to **bool** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility | [optional] [default to null]
**Visibility** | Pointer to **string** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. | [optional] [default to "null"]

## Methods

### NewCoreGroupUpdateGroupsRequestGroupsInner

`func NewCoreGroupUpdateGroupsRequestGroupsInner() *CoreGroupUpdateGroupsRequestGroupsInner`

NewCoreGroupUpdateGroupsRequestGroupsInner instantiates a new CoreGroupUpdateGroupsRequestGroupsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupUpdateGroupsRequestGroupsInnerWithDefaults

`func NewCoreGroupUpdateGroupsRequestGroupsInnerWithDefaults() *CoreGroupUpdateGroupsRequestGroupsInner`

NewCoreGroupUpdateGroupsRequestGroupsInnerWithDefaults instantiates a new CoreGroupUpdateGroupsRequestGroupsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomfields

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetCustomfields() []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetCustomfieldsOk() (*[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetCustomfields(v []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEnrolmentkey

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetEnrolmentkey() string`

GetEnrolmentkey returns the Enrolmentkey field if non-nil, zero value otherwise.

### GetEnrolmentkeyOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetEnrolmentkeyOk() (*string, bool)`

GetEnrolmentkeyOk returns a tuple with the Enrolmentkey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnrolmentkey

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetEnrolmentkey(v string)`

SetEnrolmentkey sets Enrolmentkey field to given value.

### HasEnrolmentkey

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasEnrolmentkey() bool`

HasEnrolmentkey returns a boolean if a field has been set.

### GetId

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParticipation

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetParticipation() bool`

GetParticipation returns the Participation field if non-nil, zero value otherwise.

### GetParticipationOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetParticipationOk() (*bool, bool)`

GetParticipationOk returns a tuple with the Participation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParticipation

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetParticipation(v bool)`

SetParticipation sets Participation field to given value.

### HasParticipation

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasParticipation() bool`

HasParticipation returns a boolean if a field has been set.

### GetVisibility

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetVisibility() string`

GetVisibility returns the Visibility field if non-nil, zero value otherwise.

### GetVisibilityOk

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) GetVisibilityOk() (*string, bool)`

GetVisibilityOk returns a tuple with the Visibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibility

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) SetVisibility(v string)`

SetVisibility sets Visibility field to given value.

### HasVisibility

`func (o *CoreGroupUpdateGroupsRequestGroupsInner) HasVisibility() bool`

HasVisibility returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


