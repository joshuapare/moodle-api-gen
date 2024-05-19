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
    /// ModLessonLaunchAttemptRequest
    /// </summary>
    [DataContract(Name = "mod_lesson_launch_attempt_request")]
    public partial class ModLessonLaunchAttemptRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonLaunchAttemptRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonLaunchAttemptRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonLaunchAttemptRequest" /> class.
        /// </summary>
        /// <param name="lessonid">lesson instance id (required).</param>
        /// <param name="pageid">page id to continue from (only when continuing an attempt) (default to 0).</param>
        /// <param name="password">optional password (the lesson may be protected) (default to &quot;&quot;).</param>
        /// <param name="review">if we want to review just after finishing (default to false).</param>
        public ModLessonLaunchAttemptRequest(int lessonid = default(int), int pageid = 0, string password = @"", bool review = false)
        {
            this.Lessonid = lessonid;
            this.Pageid = pageid;
            // use default value if no "password" provided
            this.Password = password ?? @"";
            this.Review = review;
        }

        /// <summary>
        /// lesson instance id
        /// </summary>
        /// <value>lesson instance id</value>
        [DataMember(Name = "lessonid", IsRequired = true, EmitDefaultValue = true)]
        public int Lessonid { get; set; }

        /// <summary>
        /// page id to continue from (only when continuing an attempt)
        /// </summary>
        /// <value>page id to continue from (only when continuing an attempt)</value>
        [DataMember(Name = "pageid", EmitDefaultValue = false)]
        public int Pageid { get; set; }

        /// <summary>
        /// optional password (the lesson may be protected)
        /// </summary>
        /// <value>optional password (the lesson may be protected)</value>
        [DataMember(Name = "password", EmitDefaultValue = false)]
        public string Password { get; set; }

        /// <summary>
        /// if we want to review just after finishing
        /// </summary>
        /// <value>if we want to review just after finishing</value>
        [DataMember(Name = "review", EmitDefaultValue = true)]
        public bool Review { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonLaunchAttemptRequest {\n");
            sb.Append("  Lessonid: ").Append(Lessonid).Append("\n");
            sb.Append("  Pageid: ").Append(Pageid).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Review: ").Append(Review).Append("\n");
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
