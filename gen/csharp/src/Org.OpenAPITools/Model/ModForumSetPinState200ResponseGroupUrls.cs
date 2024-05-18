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
    /// ModForumSetPinState200ResponseGroupUrls
    /// </summary>
    [DataContract(Name = "mod_forum_set_pin_state_200_response_group_urls")]
    public partial class ModForumSetPinState200ResponseGroupUrls : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetPinState200ResponseGroupUrls" /> class.
        /// </summary>
        /// <param name="picture">picture (default to &quot;null&quot;).</param>
        /// <param name="userlist">userlist (default to &quot;null&quot;).</param>
        public ModForumSetPinState200ResponseGroupUrls(string picture = @"null", string userlist = @"null")
        {
            // use default value if no "picture" provided
            this.Picture = picture ?? @"null";
            // use default value if no "userlist" provided
            this.Userlist = userlist ?? @"null";
        }

        /// <summary>
        /// picture
        /// </summary>
        /// <value>picture</value>
        [DataMember(Name = "picture", EmitDefaultValue = false)]
        public string Picture { get; set; }

        /// <summary>
        /// userlist
        /// </summary>
        /// <value>userlist</value>
        [DataMember(Name = "userlist", EmitDefaultValue = false)]
        public string Userlist { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumSetPinState200ResponseGroupUrls {\n");
            sb.Append("  Picture: ").Append(Picture).Append("\n");
            sb.Append("  Userlist: ").Append(Userlist).Append("\n");
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