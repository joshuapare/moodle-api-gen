# CoreGroupUpdateGroupingsRequestGroupingsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Customfields** | Pointer to [**[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | Pointer to **string** | grouping description text | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Id** | Pointer to **int32** | id of grouping | [optional] [default to null]
**Idnumber** | Pointer to **string** | id number | [optional] 
**Name** | Pointer to **string** | multilang compatible name, course unique | [optional] 

## Methods

### NewCoreGroupUpdateGroupingsRequestGroupingsInner

`func NewCoreGroupUpdateGroupingsRequestGroupingsInner() *CoreGroupUpdateGroupingsRequestGroupingsInner`

NewCoreGroupUpdateGroupingsRequestGroupingsInner instantiates a new CoreGroupUpdateGroupingsRequestGroupingsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupUpdateGroupingsRequestGroupingsInnerWithDefaults

`func NewCoreGroupUpdateGroupingsRequestGroupingsInnerWithDefaults() *CoreGroupUpdateGroupingsRequestGroupingsInner`

NewCoreGroupUpdateGroupingsRequestGroupingsInnerWithDefaults instantiates a new CoreGroupUpdateGroupingsRequestGroupingsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomfields

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetCustomfields() []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetCustomfieldsOk() (*[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) SetCustomfields(v []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreGroupUpdateGroupingsRequestGroupingsInner) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


