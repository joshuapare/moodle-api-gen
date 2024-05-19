# ToolDataprivacyCreatePurposeForm200ResponsePurpose

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** | The purpose description. | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Formattedlawfulbases** | [**[]ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  | 
**Formattedretentionperiod** | **string** | formattedretentionperiod | [default to "null"]
**Formattedsensitivedatareasons** | Pointer to [**[]ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  | [optional] 
**Id** | **int32** | id | [default to 0]
**Lawfulbases** | **string** | Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis. | [default to "null"]
**Name** | **string** | The purpose name. | [default to "null"]
**Protected** | **int32** | Data retention with higher precedent over user&#39;s request to be forgotten. | [default to 0]
**Retentionperiod** | **string** | Retention period. ISO_8601 durations format (as in DateInterval format). | [default to ""]
**Roleoverrides** | **string** | roleoverrides | [default to "null"]
**Sensitivedatareasons** | **string** | Comma-separated IDs matching records in tool_dataprivacy_sensitive | [default to ""]
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewToolDataprivacyCreatePurposeForm200ResponsePurpose

`func NewToolDataprivacyCreatePurposeForm200ResponsePurpose(description string, formattedlawfulbases []ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner, formattedretentionperiod string, id int32, lawfulbases string, name string, protected int32, retentionperiod string, roleoverrides string, sensitivedatareasons string, timecreated int32, timemodified int32, usermodified int32, ) *ToolDataprivacyCreatePurposeForm200ResponsePurpose`

NewToolDataprivacyCreatePurposeForm200ResponsePurpose instantiates a new ToolDataprivacyCreatePurposeForm200ResponsePurpose object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolDataprivacyCreatePurposeForm200ResponsePurposeWithDefaults

`func NewToolDataprivacyCreatePurposeForm200ResponsePurposeWithDefaults() *ToolDataprivacyCreatePurposeForm200ResponsePurpose`

NewToolDataprivacyCreatePurposeForm200ResponsePurposeWithDefaults instantiates a new ToolDataprivacyCreatePurposeForm200ResponsePurpose object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetFormattedlawfulbases

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetFormattedlawfulbases() []ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner`

GetFormattedlawfulbases returns the Formattedlawfulbases field if non-nil, zero value otherwise.

### GetFormattedlawfulbasesOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetFormattedlawfulbasesOk() (*[]ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner, bool)`

GetFormattedlawfulbasesOk returns a tuple with the Formattedlawfulbases field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedlawfulbases

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetFormattedlawfulbases(v []ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner)`

SetFormattedlawfulbases sets Formattedlawfulbases field to given value.


### GetFormattedretentionperiod

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetFormattedretentionperiod() string`

GetFormattedretentionperiod returns the Formattedretentionperiod field if non-nil, zero value otherwise.

### GetFormattedretentionperiodOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetFormattedretentionperiodOk() (*string, bool)`

GetFormattedretentionperiodOk returns a tuple with the Formattedretentionperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedretentionperiod

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetFormattedretentionperiod(v string)`

SetFormattedretentionperiod sets Formattedretentionperiod field to given value.


### GetFormattedsensitivedatareasons

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetFormattedsensitivedatareasons() []ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner`

GetFormattedsensitivedatareasons returns the Formattedsensitivedatareasons field if non-nil, zero value otherwise.

### GetFormattedsensitivedatareasonsOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetFormattedsensitivedatareasonsOk() (*[]ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner, bool)`

GetFormattedsensitivedatareasonsOk returns a tuple with the Formattedsensitivedatareasons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedsensitivedatareasons

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetFormattedsensitivedatareasons(v []ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner)`

SetFormattedsensitivedatareasons sets Formattedsensitivedatareasons field to given value.

### HasFormattedsensitivedatareasons

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) HasFormattedsensitivedatareasons() bool`

HasFormattedsensitivedatareasons returns a boolean if a field has been set.

### GetId

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetId(v int32)`

SetId sets Id field to given value.


### GetLawfulbases

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetLawfulbases() string`

GetLawfulbases returns the Lawfulbases field if non-nil, zero value otherwise.

### GetLawfulbasesOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetLawfulbasesOk() (*string, bool)`

GetLawfulbasesOk returns a tuple with the Lawfulbases field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLawfulbases

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetLawfulbases(v string)`

SetLawfulbases sets Lawfulbases field to given value.


### GetName

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetName(v string)`

SetName sets Name field to given value.


### GetProtected

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetProtected() int32`

GetProtected returns the Protected field if non-nil, zero value otherwise.

### GetProtectedOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetProtectedOk() (*int32, bool)`

GetProtectedOk returns a tuple with the Protected field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProtected

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetProtected(v int32)`

SetProtected sets Protected field to given value.


### GetRetentionperiod

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetRetentionperiod() string`

GetRetentionperiod returns the Retentionperiod field if non-nil, zero value otherwise.

### GetRetentionperiodOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetRetentionperiodOk() (*string, bool)`

GetRetentionperiodOk returns a tuple with the Retentionperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetentionperiod

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetRetentionperiod(v string)`

SetRetentionperiod sets Retentionperiod field to given value.


### GetRoleoverrides

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetRoleoverrides() string`

GetRoleoverrides returns the Roleoverrides field if non-nil, zero value otherwise.

### GetRoleoverridesOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetRoleoverridesOk() (*string, bool)`

GetRoleoverridesOk returns a tuple with the Roleoverrides field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleoverrides

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetRoleoverrides(v string)`

SetRoleoverrides sets Roleoverrides field to given value.


### GetSensitivedatareasons

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetSensitivedatareasons() string`

GetSensitivedatareasons returns the Sensitivedatareasons field if non-nil, zero value otherwise.

### GetSensitivedatareasonsOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetSensitivedatareasonsOk() (*string, bool)`

GetSensitivedatareasonsOk returns a tuple with the Sensitivedatareasons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSensitivedatareasons

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetSensitivedatareasons(v string)`

SetSensitivedatareasons sets Sensitivedatareasons field to given value.


### GetTimecreated

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsermodified

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *ToolDataprivacyCreatePurposeForm200ResponsePurpose) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


