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
    /// TinyEquationFilterRequest
    /// </summary>
    [DataContract(Name = "tiny_equation_filter_request")]
    public partial class TinyEquationFilterRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TinyEquationFilterRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TinyEquationFilterRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TinyEquationFilterRequest" /> class.
        /// </summary>
        /// <param name="content">The equation content (required) (default to &quot;null&quot;).</param>
        /// <param name="contextid">The context ID (required) (default to null).</param>
        public TinyEquationFilterRequest(string content = @"null", int contextid = null)
        {
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for TinyEquationFilterRequest and cannot be null");
            }
            this.Content = content;
            this.Contextid = contextid;
        }

        /// <summary>
        /// The equation content
        /// </summary>
        /// <value>The equation content</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public string Content { get; set; }

        /// <summary>
        /// The context ID
        /// </summary>
        /// <value>The context ID</value>
        [DataMember(Name = "contextid", IsRequired = true, EmitDefaultValue = true)]
        public int Contextid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TinyEquationFilterRequest {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
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
