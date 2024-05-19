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
    /// ModForumSetSubscriptionState200ResponseCapabilities
    /// </summary>
    [DataContract(Name = "mod_forum_set_subscription_state_200_response_capabilities")]
    public partial class ModForumSetSubscriptionState200ResponseCapabilities : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetSubscriptionState200ResponseCapabilities" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumSetSubscriptionState200ResponseCapabilities() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetSubscriptionState200ResponseCapabilities" /> class.
        /// </summary>
        /// <param name="favourite">favourite (required).</param>
        /// <param name="manage">manage (required).</param>
        /// <param name="move">move (required).</param>
        /// <param name="pin">pin (required).</param>
        /// <param name="post">post (required).</param>
        /// <param name="subscribe">subscribe (required).</param>
        public ModForumSetSubscriptionState200ResponseCapabilities(bool favourite = default(bool), bool manage = default(bool), bool move = default(bool), bool pin = default(bool), bool post = default(bool), bool subscribe = default(bool))
        {
            this.Favourite = favourite;
            this.Manage = manage;
            this.Move = move;
            this.Pin = pin;
            this.Post = post;
            this.Subscribe = subscribe;
        }

        /// <summary>
        /// favourite
        /// </summary>
        /// <value>favourite</value>
        [DataMember(Name = "favourite", IsRequired = true, EmitDefaultValue = true)]
        public bool Favourite { get; set; }

        /// <summary>
        /// manage
        /// </summary>
        /// <value>manage</value>
        [DataMember(Name = "manage", IsRequired = true, EmitDefaultValue = true)]
        public bool Manage { get; set; }

        /// <summary>
        /// move
        /// </summary>
        /// <value>move</value>
        [DataMember(Name = "move", IsRequired = true, EmitDefaultValue = true)]
        public bool Move { get; set; }

        /// <summary>
        /// pin
        /// </summary>
        /// <value>pin</value>
        [DataMember(Name = "pin", IsRequired = true, EmitDefaultValue = true)]
        public bool Pin { get; set; }

        /// <summary>
        /// post
        /// </summary>
        /// <value>post</value>
        [DataMember(Name = "post", IsRequired = true, EmitDefaultValue = true)]
        public bool Post { get; set; }

        /// <summary>
        /// subscribe
        /// </summary>
        /// <value>subscribe</value>
        [DataMember(Name = "subscribe", IsRequired = true, EmitDefaultValue = true)]
        public bool Subscribe { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumSetSubscriptionState200ResponseCapabilities {\n");
            sb.Append("  Favourite: ").Append(Favourite).Append("\n");
            sb.Append("  Manage: ").Append(Manage).Append("\n");
            sb.Append("  Move: ").Append(Move).Append("\n");
            sb.Append("  Pin: ").Append(Pin).Append("\n");
            sb.Append("  Post: ").Append(Post).Append("\n");
            sb.Append("  Subscribe: ").Append(Subscribe).Append("\n");
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
