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
    /// CoreGetStringsRequestStringsInnerStringparamsInner
    /// </summary>
    [DataContract(Name = "core_get_strings_request_strings_inner_stringparams_inner")]
    public partial class CoreGetStringsRequestStringsInnerStringparamsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGetStringsRequestStringsInnerStringparamsInner" /> class.
        /// </summary>
        /// <param name="name">param name                                     - if the string expect only one $a parameter then don&#39;t send this field, just send the value. (default to &quot;null&quot;).</param>
        /// <param name="value">param value.</param>
        public CoreGetStringsRequestStringsInnerStringparamsInner(string name = @"null", string value = default(string))
        {
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            this.Value = value;
        }

        /// <summary>
        /// param name                                     - if the string expect only one $a parameter then don&#39;t send this field, just send the value.
        /// </summary>
        /// <value>param name                                     - if the string expect only one $a parameter then don&#39;t send this field, just send the value.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// param value
        /// </summary>
        /// <value>param value</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGetStringsRequestStringsInnerStringparamsInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
