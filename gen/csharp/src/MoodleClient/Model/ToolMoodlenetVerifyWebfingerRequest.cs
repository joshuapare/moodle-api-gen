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
    /// ToolMoodlenetVerifyWebfingerRequest
    /// </summary>
    [DataContract(Name = "tool_moodlenet_verify_webfinger_request")]
    public partial class ToolMoodlenetVerifyWebfingerRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolMoodlenetVerifyWebfingerRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolMoodlenetVerifyWebfingerRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolMoodlenetVerifyWebfingerRequest" /> class.
        /// </summary>
        /// <param name="course">The course we are adding to (required) (default to null).</param>
        /// <param name="profileurl">The profile url that the user has given us (required) (default to &quot;null&quot;).</param>
        /// <param name="section">The section within the course we are adding to (required) (default to null).</param>
        public ToolMoodlenetVerifyWebfingerRequest(int course = null, string profileurl = @"null", int section = null)
        {
            this.Course = course;
            // to ensure "profileurl" is required (not null)
            if (profileurl == null)
            {
                throw new ArgumentNullException("profileurl is a required property for ToolMoodlenetVerifyWebfingerRequest and cannot be null");
            }
            this.Profileurl = profileurl;
            this.Section = section;
        }

        /// <summary>
        /// The course we are adding to
        /// </summary>
        /// <value>The course we are adding to</value>
        [DataMember(Name = "course", IsRequired = true, EmitDefaultValue = true)]
        public int Course { get; set; }

        /// <summary>
        /// The profile url that the user has given us
        /// </summary>
        /// <value>The profile url that the user has given us</value>
        [DataMember(Name = "profileurl", IsRequired = true, EmitDefaultValue = true)]
        public string Profileurl { get; set; }

        /// <summary>
        /// The section within the course we are adding to
        /// </summary>
        /// <value>The section within the course we are adding to</value>
        [DataMember(Name = "section", IsRequired = true, EmitDefaultValue = true)]
        public int Section { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolMoodlenetVerifyWebfingerRequest {\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Profileurl: ").Append(Profileurl).Append("\n");
            sb.Append("  Section: ").Append(Section).Append("\n");
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
