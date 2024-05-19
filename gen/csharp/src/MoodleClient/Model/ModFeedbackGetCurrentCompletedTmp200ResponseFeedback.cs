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
    /// ModFeedbackGetCurrentCompletedTmp200ResponseFeedback
    /// </summary>
    [DataContract(Name = "mod_feedback_get_current_completed_tmp_200_response_feedback")]
    public partial class ModFeedbackGetCurrentCompletedTmp200ResponseFeedback : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetCurrentCompletedTmp200ResponseFeedback" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModFeedbackGetCurrentCompletedTmp200ResponseFeedback() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetCurrentCompletedTmp200ResponseFeedback" /> class.
        /// </summary>
        /// <param name="anonymousResponse">Whether is an anonymous response. (required) (default to null).</param>
        /// <param name="courseid">The course id where the feedback was completed. (required) (default to null).</param>
        /// <param name="feedback">The feedback instance id this records belongs to. (required) (default to null).</param>
        /// <param name="guestid">For guests, this is the session key. (required) (default to &quot;null&quot;).</param>
        /// <param name="id">The record id. (required).</param>
        /// <param name="randomResponse">The response number (used when shuffling anonymous responses). (required) (default to null).</param>
        /// <param name="timemodified">The last time the feedback was completed. (required) (default to null).</param>
        /// <param name="userid">The user who completed the feedback (0 for anonymous). (required) (default to null).</param>
        public ModFeedbackGetCurrentCompletedTmp200ResponseFeedback(int anonymousResponse = null, int courseid = null, int feedback = null, string guestid = @"null", int id = default(int), int randomResponse = null, int timemodified = null, int userid = null)
        {
            this.AnonymousResponse = anonymousResponse;
            this.Courseid = courseid;
            this.Feedback = feedback;
            // to ensure "guestid" is required (not null)
            if (guestid == null)
            {
                throw new ArgumentNullException("guestid is a required property for ModFeedbackGetCurrentCompletedTmp200ResponseFeedback and cannot be null");
            }
            this.Guestid = guestid;
            this.Id = id;
            this.RandomResponse = randomResponse;
            this.Timemodified = timemodified;
            this.Userid = userid;
        }

        /// <summary>
        /// Whether is an anonymous response.
        /// </summary>
        /// <value>Whether is an anonymous response.</value>
        [DataMember(Name = "anonymous_response", IsRequired = true, EmitDefaultValue = true)]
        public int AnonymousResponse { get; set; }

        /// <summary>
        /// The course id where the feedback was completed.
        /// </summary>
        /// <value>The course id where the feedback was completed.</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// The feedback instance id this records belongs to.
        /// </summary>
        /// <value>The feedback instance id this records belongs to.</value>
        [DataMember(Name = "feedback", IsRequired = true, EmitDefaultValue = true)]
        public int Feedback { get; set; }

        /// <summary>
        /// For guests, this is the session key.
        /// </summary>
        /// <value>For guests, this is the session key.</value>
        [DataMember(Name = "guestid", IsRequired = true, EmitDefaultValue = true)]
        public string Guestid { get; set; }

        /// <summary>
        /// The record id.
        /// </summary>
        /// <value>The record id.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// The response number (used when shuffling anonymous responses).
        /// </summary>
        /// <value>The response number (used when shuffling anonymous responses).</value>
        [DataMember(Name = "random_response", IsRequired = true, EmitDefaultValue = true)]
        public int RandomResponse { get; set; }

        /// <summary>
        /// The last time the feedback was completed.
        /// </summary>
        /// <value>The last time the feedback was completed.</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// The user who completed the feedback (0 for anonymous).
        /// </summary>
        /// <value>The user who completed the feedback (0 for anonymous).</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModFeedbackGetCurrentCompletedTmp200ResponseFeedback {\n");
            sb.Append("  AnonymousResponse: ").Append(AnonymousResponse).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Feedback: ").Append(Feedback).Append("\n");
            sb.Append("  Guestid: ").Append(Guestid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  RandomResponse: ").Append(RandomResponse).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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
