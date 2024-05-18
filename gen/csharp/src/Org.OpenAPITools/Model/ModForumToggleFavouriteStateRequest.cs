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
    /// ModForumToggleFavouriteStateRequest
    /// </summary>
    [DataContract(Name = "mod_forum_toggle_favourite_state_request")]
    public partial class ModForumToggleFavouriteStateRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumToggleFavouriteStateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumToggleFavouriteStateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumToggleFavouriteStateRequest" /> class.
        /// </summary>
        /// <param name="discussionid">The discussion to subscribe or unsubscribe (required).</param>
        /// <param name="targetstate">The target state (required).</param>
        public ModForumToggleFavouriteStateRequest(int discussionid = default(int), bool targetstate = default(bool))
        {
            this.Discussionid = discussionid;
            this.Targetstate = targetstate;
        }

        /// <summary>
        /// The discussion to subscribe or unsubscribe
        /// </summary>
        /// <value>The discussion to subscribe or unsubscribe</value>
        [DataMember(Name = "discussionid", IsRequired = true, EmitDefaultValue = true)]
        public int Discussionid { get; set; }

        /// <summary>
        /// The target state
        /// </summary>
        /// <value>The target state</value>
        [DataMember(Name = "targetstate", IsRequired = true, EmitDefaultValue = true)]
        public bool Targetstate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumToggleFavouriteStateRequest {\n");
            sb.Append("  Discussionid: ").Append(Discussionid).Append("\n");
            sb.Append("  Targetstate: ").Append(Targetstate).Append("\n");
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