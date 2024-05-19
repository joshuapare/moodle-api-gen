/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreUpdateInplaceEditableRequest
    /// </summary>
    [DataContract(Name = "core_update_inplace_editable_request")]
    public partial class CoreUpdateInplaceEditableRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUpdateInplaceEditableRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreUpdateInplaceEditableRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUpdateInplaceEditableRequest" /> class.
        /// </summary>
        /// <param name="component">component responsible for the update (required) (default to &quot;null&quot;).</param>
        /// <param name="itemid">identifier of the updated item (required) (default to &quot;null&quot;).</param>
        /// <param name="itemtype">type of the updated item inside the component (required) (default to &quot;null&quot;).</param>
        /// <param name="value">new value (required) (default to &quot;null&quot;).</param>
        public CoreUpdateInplaceEditableRequest(string component = @"null", string itemid = @"null", string itemtype = @"null", string value = @"null")
        {
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreUpdateInplaceEditableRequest and cannot be null");
            }
            this.Component = component;
            // to ensure "itemid" is required (not null)
            if (itemid == null)
            {
                throw new ArgumentNullException("itemid is a required property for CoreUpdateInplaceEditableRequest and cannot be null");
            }
            this.Itemid = itemid;
            // to ensure "itemtype" is required (not null)
            if (itemtype == null)
            {
                throw new ArgumentNullException("itemtype is a required property for CoreUpdateInplaceEditableRequest and cannot be null");
            }
            this.Itemtype = itemtype;
            // to ensure "value" is required (not null)
            if (value == null)
            {
                throw new ArgumentNullException("value is a required property for CoreUpdateInplaceEditableRequest and cannot be null");
            }
            this.Value = value;
        }

        /// <summary>
        /// component responsible for the update
        /// </summary>
        /// <value>component responsible for the update</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// identifier of the updated item
        /// </summary>
        /// <value>identifier of the updated item</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public string Itemid { get; set; }

        /// <summary>
        /// type of the updated item inside the component
        /// </summary>
        /// <value>type of the updated item inside the component</value>
        [DataMember(Name = "itemtype", IsRequired = true, EmitDefaultValue = true)]
        public string Itemtype { get; set; }

        /// <summary>
        /// new value
        /// </summary>
        /// <value>new value</value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = true)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreUpdateInplaceEditableRequest {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Itemtype: ").Append(Itemtype).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
