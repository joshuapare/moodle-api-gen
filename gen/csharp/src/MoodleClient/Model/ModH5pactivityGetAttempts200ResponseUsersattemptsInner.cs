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
    /// ModH5pactivityGetAttempts200ResponseUsersattemptsInner
    /// </summary>
    [DataContract(Name = "mod_h5pactivity_get_attempts_200_response_usersattempts_inner")]
    public partial class ModH5pactivityGetAttempts200ResponseUsersattemptsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityGetAttempts200ResponseUsersattemptsInner" /> class.
        /// </summary>
        /// <param name="attempts">attempts.</param>
        /// <param name="scored">scored.</param>
        /// <param name="userid">The user id.</param>
        public ModH5pactivityGetAttempts200ResponseUsersattemptsInner(List<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner> attempts = default(List<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner>), ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored scored = default(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored), int userid = default(int))
        {
            this.Attempts = attempts;
            this.Scored = scored;
            this.Userid = userid;
        }

        /// <summary>
        /// Gets or Sets Attempts
        /// </summary>
        [DataMember(Name = "attempts", EmitDefaultValue = false)]
        public List<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner> Attempts { get; set; }

        /// <summary>
        /// Gets or Sets Scored
        /// </summary>
        [DataMember(Name = "scored", EmitDefaultValue = false)]
        public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored Scored { get; set; }

        /// <summary>
        /// The user id
        /// </summary>
        /// <value>The user id</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModH5pactivityGetAttempts200ResponseUsersattemptsInner {\n");
            sb.Append("  Attempts: ").Append(Attempts).Append("\n");
            sb.Append("  Scored: ").Append(Scored).Append("\n");
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
