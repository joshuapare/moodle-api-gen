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
    /// CoreUserCreateUsersRequestUsersInnerCustomfieldsInner
    /// </summary>
    [DataContract(Name = "core_user_create_users_request_users_inner_customfields_inner")]
    public partial class CoreUserCreateUsersRequestUsersInnerCustomfieldsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUserCreateUsersRequestUsersInnerCustomfieldsInner" /> class.
        /// </summary>
        /// <param name="type">The name of the custom field.</param>
        /// <param name="value">The value of the custom field.</param>
        public CoreUserCreateUsersRequestUsersInnerCustomfieldsInner(string type = default(string), string value = default(string))
        {
            this.Type = type;
            this.Value = value;
        }

        /// <summary>
        /// The name of the custom field
        /// </summary>
        /// <value>The name of the custom field</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// The value of the custom field
        /// </summary>
        /// <value>The value of the custom field</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreUserCreateUsersRequestUsersInnerCustomfieldsInner {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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