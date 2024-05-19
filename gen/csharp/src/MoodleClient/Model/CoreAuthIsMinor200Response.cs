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
    /// CoreAuthIsMinor200Response
    /// </summary>
    [DataContract(Name = "core_auth_is_minor_200_response")]
    public partial class CoreAuthIsMinor200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthIsMinor200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreAuthIsMinor200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthIsMinor200Response" /> class.
        /// </summary>
        /// <param name="status">True if the user is considered to be a digital minor,                     false if not (required) (default to null).</param>
        public CoreAuthIsMinor200Response(bool status = null)
        {
            this.Status = status;
        }

        /// <summary>
        /// True if the user is considered to be a digital minor,                     false if not
        /// </summary>
        /// <value>True if the user is considered to be a digital minor,                     false if not</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreAuthIsMinor200Response {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
