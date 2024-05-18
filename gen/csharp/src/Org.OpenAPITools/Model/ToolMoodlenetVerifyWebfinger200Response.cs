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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ToolMoodlenetVerifyWebfinger200Response
    /// </summary>
    [DataContract(Name = "tool_moodlenet_verify_webfinger_200_response")]
    public partial class ToolMoodlenetVerifyWebfinger200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolMoodlenetVerifyWebfinger200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolMoodlenetVerifyWebfinger200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolMoodlenetVerifyWebfinger200Response" /> class.
        /// </summary>
        /// <param name="domain">Domain to redirect the user to (default to &quot;null&quot;).</param>
        /// <param name="message">Our message for the user (required) (default to &quot;null&quot;).</param>
        /// <param name="result">Was the passed content a valid WebFinger? (required) (default to null).</param>
        public ToolMoodlenetVerifyWebfinger200Response(string domain = @"null", string message = @"null", bool result = null)
        {
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for ToolMoodlenetVerifyWebfinger200Response and cannot be null");
            }
            this.Message = message;
            this.Result = result;
            // use default value if no "domain" provided
            this.Domain = domain ?? @"null";
        }

        /// <summary>
        /// Domain to redirect the user to
        /// </summary>
        /// <value>Domain to redirect the user to</value>
        [DataMember(Name = "domain", EmitDefaultValue = false)]
        public string Domain { get; set; }

        /// <summary>
        /// Our message for the user
        /// </summary>
        /// <value>Our message for the user</value>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Was the passed content a valid WebFinger?
        /// </summary>
        /// <value>Was the passed content a valid WebFinger?</value>
        [DataMember(Name = "result", IsRequired = true, EmitDefaultValue = true)]
        public bool Result { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolMoodlenetVerifyWebfinger200Response {\n");
            sb.Append("  Domain: ").Append(Domain).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
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
